package day20210207;


/**
 *
 * 尝试双索引在解决字符串 回文，翻转问题的应用
 *
 */
public class Day20210207 {

    public static Boolean isPlalindrome(String s) {
        boolean result = true;
        int n = s.length();
        int left = 0;                                       //left pointer
        int right = n - 1;                                  //right pointer
        while (left < right) {
            //考虑当前字符是数字或者字母的情况
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left ++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right --;
            }

            //判断左右索引对应的元素是否一致，并排除特殊字符串
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left ++;
            right --;

        }
        return result;
    }

    public static void reverseStringArray(char[] ch){
        int left = 0;
        int right = ch.length -1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left ++;
            right --;
        }
    }

}
