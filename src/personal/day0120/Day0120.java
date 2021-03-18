package personal.day0120;

/**
 * leetcode 题库联系2020.01.20
 *
 * 数组问题
 */
public class Day0120 {
    // 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/container-with-most-water
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    // 输入: [1,8,6,2,5,4,8,3,7]
    //输出: 49

    /**
     *虽然解决了问题但是时间复杂度较高
     * @param height
     * @return 返回最大面积
     */
    public static int maxArea(int[] height) {
        int area = 0;
        int tempArea = 0;
        int tempHeight = 0;
        for (int i = 0,length = height.length;i<length;i++){

            for (int j = length -1;j>i;j--) {
                tempHeight = height[j] < height[i] ? height[j] : height[i];
                tempArea = tempHeight * (j - i);
                if (tempArea > area) {
                    area = tempArea;
                }
            }
        }
        return area;
    }

    /**
     * 求最大面试使用双指针来解决减少时间复杂度
     * @param height
     * @return
     */
    public int maxAreaByTwoPointer(int[] height) {
        int area = 0;
        int i = 0,j=height.length-1;
        //第一次考虑了双重for循环时间复杂度n二次方较高提交没成功；
        //这次试用数组双索引减少了时间复杂度
        while(j >= i){
            //最大面积取决于 [i,j]区间内 最小的值
            area = Math.max(area,Math.min(height[i],height[j]) * (j-i));
            //双索引移动的条件 就是那边小那边移动；
            if(height[i] < height[j]) {
                i++;
            }else {
                j--;
            }
        }
        return area;
    }

    /**
     * 查找最长公共前缀
     * ["leet","leets","leetcode","let"]  最长公共前缀是 "le"
     * @author 沉默的码农
     * @date 2021-03-09 17:02
     * @param [str]  
     * @return java.lang.String  
     */  
    public String longestCommonPrefix(String[] str) {
        String prefix = str[0];
        for(int i = 0;i<str.length;i++) {
            //前缀字符串 没有在各个字符串元素中出现循环
            while (str[i].indexOf(prefix) != 0) {
                //重新赋值前缀字符串 没走进一次循环 前缀字符串长度都减1
                prefix = prefix.substring(0,prefix.length() -1);
            }
        }
        
        return prefix;
    }

    public String longestCommonPrefix2(String[] str) {
        if(str == null || str.length == 0) {
            return "";
        }
        String prefix = "";
        for(int i = 0;i<str[0].length();i++) {
            char ch = str[0].charAt(i);
            for(int j = 0;j<str.length;j++) {
                //最长字符串满足 以下两种情况 1：有一个字符在任意一个字符串元素不存在时 2：任意字符串长度大于i
                if(str[j].charAt(i) != ch || str[j].length() > i) {
                    prefix = str[0].substring(0,i);
                }
            }
        }
        return prefix;
    }
}
