package personal.day1014;


import java.util.HashMap;
import java.util.Map;

public class SubString {

    public int lengthOfLongestSubstring(String s){
        int n = s.length();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        //用map 键值对进行解决此类问题；i代表字符串的初始位置，j代表移动指针找到不重复的字符位置 ans = j-i+1；
        for(int i = 0, j = 0;j < n; j++) {
            if(map.containsKey(s.charAt(j))) {
                System.out.println(s.charAt(j));
                i = Math.max(map.get(s.charAt(j)),i);
                System.out.println("i:"+i);
            }
            ans = Math.max(ans,j - i + 1);
            System.out.println("ans"+ans);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
