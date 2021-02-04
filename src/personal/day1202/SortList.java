package personal.day1202;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode merge(ListNode[] list) {
        ListNode head = new ListNode(0);
        List<Integer> l = new ArrayList<Integer>();
        for (ListNode ln : list) {
            while (ln != null) {
                l.add(ln.val);
                ln = ln.next;
            }
        }
        System.out.println(l.size());
        Collections.sort(l);
        ListNode h = head;
        for (int i : l) {
            ListNode temp = new ListNode(i);
            h.next = temp;
            h = h.next;
        }
        h.next = null;
        return  head.next;
    }

    public  void test() {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(1);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
        boolean result = false;
        list1.next = list3;
        list3.next = list2;
        list2.next = list4;
        list4.next = list5;
        list5.next = null;
        ListNode[] ln = {list1};
        ListNode h = merge(ln);
        while (true) {
            System.out.println("value="+h.val+"---" );
            h = h.next;
            if(h ==null) {
                break;
            }
        }

    }

    public ListNode reverseKGroup(ListNode head,int k) {
        ListNode curr = head;
        int count = 0;
        while (curr != null && count != k) { // find the k+1 node
            curr = curr.next;
            count++;
        }
        if (count == k) { // if k+1 node is found
            curr = reverseKGroup(curr, k); // reverse list with k+1 node as head
            // head - head-pointer to direct part,
            // curr - head-pointer to reversed part;
            System.out.println(curr.val);
            while (count-- > 0) { // reverse current k-group:
                ListNode tmp = head.next; // tmp - next head in direct part
                head.next = curr; // preappending "direct" head to the reversed list
                curr = head; // move head of reversed part to a new node
                head = tmp; // move "direct" head to the next node in direct part
                System.out.println("exchange tmp"+tmp.val);
                System.out.println("exchange head" +head.val);
                System.out.println("exchange curr"+curr.val);

            }
            head = curr;
        }
        return head;
    }

    public void testreverseKGroup() {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(1);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
        list1.next = list3;
        list3.next = list2;
        list2.next = list4;
        list4.next = list5;
        list5.next = null;
        ListNode temp = list1;
        while (temp != null) {
            temp = temp.next;

        }
        ListNode head = reverseKGroup(list1,3);
        int count = 0;
        while (head != null) {
            head = head.next;
            count ++;
        }
        return ;
    }
}
