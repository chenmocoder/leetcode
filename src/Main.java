import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

import day20210204.MinStack;
import day20210207.Day20210207;
import day20210220.DpPronlems;
import day20210302.LinkedListProblem;
import personal.day0120.Day0120;
//import personal.day0120.day0121.ListNode;
import personal.day0120.day0121.LinkedList;
import personal.day0120.day0121.ListNode;
import personal.day1014.SubString;
import personal.day1202.SortList;
import personal.day1203.Day1203;

public class Main {
    public static void main(String[] args) throws IOException {
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
//
//        int[] arr = {1,9,2,3,8,2,5};
//
//
//            try {
//                Day1203.selectSortFunction(arr);
//                //Day1203.bubbleSortFunction(arr);
//                //Day1203.insertSortFunction(arr);
//                arr.clone();
//            } catch (Exception e1) {
//                e1.printStackTrace();
//            }
//            for(int e : arr) {
//                System.out.print(e);
//            }

        //test min static
//        MinStack minStack = new MinStack();
//        int[] testArr = {2,3,1,8,4,10};
//        for(int ele : testArr){
//            minStack.pushToStack(ele);
//        }
//        System.out.println("----------");
//        System.out.print(minStack.getMinFromStatic());
//        System.out.println("----------");
//        minStack.popFromStack();
//        minStack.popFromStack();
//        System.out.println("top" + minStack.top());
//        System.out.println("min" + minStack.getMinFromStatic());

        //test plalindrome string
//        String s = "A man, a plan, a canal: Panama";
//        boolean result = Day20210207.isPlalindrome(s);
//        System.out.println(result);
//        char[] tempch = s.toCharArray();
//        Day20210207.reverseStringArray(tempch);
//        System.out.println(tempch);

//          String temp = "abaaacdcaaa";
//          int longth = Day20210207.longestPaildrome(temp);
//          System.out.println(longth);

//          int[] coins = {3,2,7};
//          int amount = 10;
//          System.out.println(DpPronlems.coinChange(coins,amount));

//        String str = DpPronlems.longestPalindrome("aaa");
//        int len = DpPronlems.longestPalindromeSubSeqlength("bbbab");
//        System.out.println("len = " + len);
//        int pathNum = DpPronlems.uniquePaths(3,7);
//        int[][] ob = {{0,0,0},{0,1,1},{0,0,0}};
//        int pathNum = DpPronlems.uniquePathsWithObstacles(ob);
//        System.out.println(pathNum);

//        LinkedList linkedList = new LinkedList(1);
//        linkedList.pushTail(10);
//        linkedList.pushTail(11);
//        linkedList.pushTail(12);
//        linkedList.pushTail(13);
//        linkedList.pushTail(14);
//        ListNode head = linkedList.getHead();
//
//        ListNode afHead = linkedList.removeNthFromEnd(head,2);
//        linkedList.showLinkedList(afHead);
        //ListNode last = linkedList.getLastNode();
        //last.setNext(head);
        //boolean hsCycle = linkedList.hasCycle(head);
        //System.out.println("hsCycle"+hsCycle);
        //ListNode rhead = linkedList.reverseLinkedList(head);

        //ListNode rhead = linkedList.reverseLinkedListByRecusion(head);
        //linkedList.showLinkedList(rhead);
        //linkedList.showLinkedList(head);
        //ListNode reverNumHead = linkedList.reverseLinkedNumber(head,2);
        //linkedList.showLinkedList(reverNumHead);

//        int i = 210;
//        Integer in = new Integer(i);
//        String str = in.toString();
//        char[] ch = str.toCharArray();
//        int k = 0,j = ch.length - 1;
//        while (j >= k) {
//            char temp = ch[j];
//            ch[j] = ch[k];
//            ch[k] = temp;
//            k++;
//            j--;
//        }
//
//        String chstr = String.valueOf(ch);
//        int result = Integer.parseInt(chstr);
//        System.out.println(result);

//        String str = "hello world";
//        String[] stringArr = str.split(" ");
//        String lastStr = stringArr[stringArr.length - 1];
//        System.out.println(getLastWordFromString("hello world"));
//        for(String ele : strArr) {
//            System.out.println(ele);
//        }
//        InputStream in = System.in;

        Scanner scan = new Scanner(System.in);

//        while (scan.hasNext()) {
//            System.out.println(getLastWordFromString(scan.next()));
//        }
//        System.out.println(args);

//        int count = 0;
//        String tarStr = "";
//        char ch = 'a';
//        while (scan.hasNextLine() && count ++ != 2){
//
//            if(count/2 == 0) {
//                tarStr = scan.nextLine();
//            } else {
//                ch = scan.nextLine().toCharArray()[0];
//            }
//        }
//        System.out.println(getCount(tarStr,ch));

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = bf.readLine()) != null) {
            int length = str.length();
            int start = 0;
            length8String(str,length,start);
        }


    }

    public static int getLastWordFromString(String str) {
        int result = 0;
        if(str == null) {
            return result;
        }
        String[] strArr = str.split(" ");
        String lastStr = strArr[strArr.length - 1];
        result = lastStr.length();
        return result;
    }

    public static int getCount(String str,char ch) {
        int result = 0;
        char[] strToch = str.toCharArray();
        for(char ele : strToch) {
            if(Character.toLowerCase(ele) == Character.toLowerCase(ch)) {
                result++;
            }
        }
        return result;
    }

    public static void survey(int[] arr) {

    }

    public static void length8String(String str,int length,int start) {

        while(length >= 8) {
            String temp = str.substring(start,start+8);
            System.out.println(temp);
            start = start + 8;
            length = length - 8;

        }
//        if(length < 8) {         //此处逻辑判断错误应该判断 剩余长度大于0
        if(length > 0) {
            char[] ch = new char[8];
            for(int i =0;i<8;i++) {
                ch[i] = '0';
            }
            for(int i = 0;start < str.length();i++) {
                ch[i] = str.charAt(start++);
            }
            System.out.println(String.valueOf(ch));
        }
    }
}
