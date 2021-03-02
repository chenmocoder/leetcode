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
        for(int i = str.length() -1;i >= 0;i--) {
            for(int j = i;j < str.length();j++ ) {
                //判断 i-j 是否为回文字符串的判断条件  (j-i < 3)意思是 i-j 匹配度段长度小于等于三 时 str[i] == str[j]  该段就是回文
                dp[i][j] = str.charAt(i) == str.charAt(j) && (j -i <3 || dp[i+1][j-1]);
                if(dp[i][j]) {
                    tempStr = tempStr.length() > j -i + 1 ? tempStr : str.substring(i,j+1);
                }
            }
        }
        return tempStr;
    }

    /**
     * 最长回文序列 注意此处是subseq  不是substring 子字符串必定是是相连的，而子序列subseq是可以隔开的
     * @author 沉默的码农
     * @date 2021-02-23 14:10
     * @param [str]
     * @return int
     */
    public static int longestPalindromeSubSeqlength(String str) {
        int len = 0;
        int[][] dp = new int[str.length()][str.length()];
        for(int i = str.length() -1 ;i>= 0 ;i--) {
            dp[i][i] = 1;
            for(int j = i + 1; j<str.length();j++) {
                //连续字符串相等时
                if(str.charAt(i) == str.charAt(j)){
                    dp[i][j] = dp[i +1][j -1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);   //此处的含义还需要在研究下
                }
            }
        }
        return dp[0][str.length() -1];
    }
    /**
     *
     * 迷宫有多少种路径
     * @author 沉默的码农
     * @date 2021-02-23 15:15
     * @param [m, n]
     * @return int
     */
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0;i<m;i++) {
            for(int j = 0; j<n;j++) {
                if(i == 0 || j == 0) {
                    //特殊情况 一行 或者一列 只有一种方式；
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];
    }

    /**
     *
     * @param obstacleGrid
     * @return
     */
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;

        // 如果初始节点就存在障碍物则没有路径
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        //初始节点没有障碍物则路径就是1
        obstacleGrid[0][0] = 1;
        //如果只有一行 则需要满足 [i][0]不存在障碍物 并且 [i-1][0]也不存在障碍物
        for (int i = 1; i < R; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }
        //与只有一行类似的情况
        for (int i = 1; i < C; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        }

        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        // Return value stored in rightmost bottommost cell. That is the destination.
        return obstacleGrid[R - 1][C - 1];

    }


}
