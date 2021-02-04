import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import personal.day0120.Day0120;
//import personal.day0120.day0121.ListNode;
import personal.day1014.SubString;
import personal.day1202.SortList;
import personal.day1203.Day1203;

public class Main {
    public static void main(String[] args) {
//        String[] array = new String[]{"a","b","c"};
//        List<String> arryList = Arrays.asList(array);
//        Iterator iter = arryList.iterator();
//        System.out.println(iter);
        // java lambda 两种写法
//        arryList.forEach(System.out::println);
//        arryList.forEach( a -> System.out.println(a));
//        int[] height = {1,8,6,2,5,4,8,3,7};
//        System.out.println(Day0120.maxArea(height));
//        ListNode listNode = new ListNode(1);

        //2020 10.14  无重复最长子字符串解决方法
//        SubString subString = new SubString();
//        String str = "franksshandsomeeee";
//        int ans = subString.lengthOfLongestSubstring(str);
//        System.out.println(ans);
//
//        SortList sortList = new SortList();
//        //sortList.test();
//        double aa = 2* 4.00;
//
//        sortList.testreverseKGroup();

        int[] arr = {1,9,2,3,8,2,5};


            try {
                Day1203.selectSortFunction(arr);
                //Day1203.bubbleSortFunction(arr);
                //Day1203.insertSortFunction(arr);
                arr.clone();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            for(int e : arr) {
                System.out.print(e);
            }
    }
}
