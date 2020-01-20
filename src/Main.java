import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import personal.day0120.Day0120;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"a","b","c"};
        List<String> arryList = Arrays.asList(array);
        Iterator iter = arryList.iterator();
        System.out.println(iter);
        // java lambda 两种写法
        arryList.forEach(System.out::println);
        arryList.forEach( a -> System.out.println(a));
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(Day0120.maxArea(height));
    }
}
