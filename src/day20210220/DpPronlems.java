package day20210220;

import java.lang.reflect.Array;

/**
 * @className DpPronlems
 * @description dp 动态规划静定问题收录，结题思路整理
 * @Author 沉默的码农
 * @DATE 2021-02-20 17:31
 */
public class DpPronlems {
    
    /**    
     * @author 沉默的码农
     * @date 2021-02-20 17:37  
     * @param [coins, amount]
     * @return int  
     */  
    public static int coinChange(int[] coins,int amount) {
        //初始化一维数组 存储组成对应金额数所需要的最少硬币数量
        int[] dp =  new int[amount + 1];

        //处理异常情况
        if(amount == 0) {
            return 0;
        }
        for(int ele : coins) {
            if(amount < ele) {
                return -1;
            }
        }
        //分析金额由几个硬币组成例如 硬币[1,2,7,10] ， 金额 ： 14 此种特殊情况如果使用贪心算法 则认为先选一枚硬币10
        // 再选 两个 2 则构成最小硬币数量但是 直接选择两个 7 则是最优解
        //
        //
        for(int i = 1;i < amount + 1; i++) {
            dp[0] = 0;
            dp[i] = Integer.MAX_VALUE - 1;
            for(int j = 0; j<coins.length; j++) {
                //防止数组越界
                if(i >= coins[j]) {
                    dp[i] = Math.min(dp[i - coins[j]] + 1,dp[i]);
                    System.out.println("dp[" + i + "]" + "=" + dp[i]);
                }
            }

        }
        return dp[amount];
    }

    /**    
     * @author 沉默的码农
     * @date 2021-02-22 18:10  
     * @param [str]
     * @return java.lang.String  
     */  
    public static String longestPalindrome(String str) {  
        String tempStr = "";

        boolean[][] dp = new boolean[str.length()][str.length()];
        dp[0][0] = true;
        for(int i = 1;i<str.length();i++) {
            dp[i][i] = true;
            for(int j = 0;j<i; j++) {
                if(str.charAt(i) == str.charAt(j) && str.charAt(j+1) == str.charAt(i-1)) {
                    System.out.println(str.substring(j,i +1));
                    tempStr = tempStr.length() > str.substring(j,i +1).length() ? tempStr : str.substring(j,i +1);
                }
            }
        }
        return tempStr;
    }

}
