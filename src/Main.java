import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

        LinkedList linkedList = new LinkedList(1);
        linkedList.pushTail(10);
        linkedList.pushTail(11);
        linkedList.pushTail(12);
        linkedList.pushTail(13);
        linkedList.pushTail(14);
        ListNode head = linkedList.getHead();

        ListNode afHead = linkedList.removeNthFromEnd(head,2);
        linkedList.showLinkedList(afHead);
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
    }
}
