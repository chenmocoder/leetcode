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
     *
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
}
