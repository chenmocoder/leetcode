package personal.day0120.day0121;

import java.util.List;

public class LinkedList {

    public int size;

    public ListNode head;   //头部节点

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    public LinkedList(Object obj) {
        ListNode node = new ListNode(obj);
        this.head = node;
        this.size = 1;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }


    /**    
     * @author 沉默的码农
     * @date 2021-03-02 13:55  
     * @param [obj]
     * @return void  
     */  
    public void pushHead(Object obj) {
        ListNode node = new ListNode(obj);
        if(head != null && head.next != null){
            node.next = head.next;
            head.next = node;
        }
    }
    
    /**    
     * @author 沉默的码农
     * @date 2021-03-02 13:58  
     * @param [obj]
     * @return void  
     */  
    public void pushTail(Object obj) {
        ListNode node = new ListNode(obj);
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        size ++;
    }

    public boolean hasCycle(ListNode head) {
        boolean result = false;
        if(head == null) {
            return result;
        }
        //慢指针
        ListNode slow = head;
        //快指针
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            //慢指针每一次循环向前走一个
            slow = slow.next;
            //快指针每次走向前走两个
            fast = fast.next.next;
            //当慢指针和快指针重复时则认为该链表有环
            if(slow == fast) {
                result = true;
                break;
            }
        }
        return result;
    }

    public ListNode getLastNode() {
        ListNode cur = head;
        if(head == null) {
            return null;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    public ListNode getHead() {
        return this.head;
    }

    /**
     * 双指针迭代翻转
     * @author 沉默的码农
     * @date 2021-03-03 10:19
     * @param [head]
     * @return personal.day0120.day0121.ListNode
     */
    public ListNode reverseLinkedList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        if(cur == null || cur.next == null) {
            return head;
        }
        while (cur != null) {                  //循环的条件 就是当前节点不能为空
            ListNode tempNode = cur.next;      //当前节点的下一个节点
            cur.next = pre;                    //当前节点的指针指向前一个节点
            pre = cur;                         //当前节点 赋值给前一个节点
            cur = tempNode;                    //当前节点的下一个节点 赋值给 当前节点 目的使能向前继续迭代
        }
        return pre;
    }

    /**
     * 用递归进行链表翻转
     * @author 沉默的码农
     * @date 2021-03-08 9:01
     * @param [head]
     * @return personal.day0120.day0121.ListNode
     */
    public ListNode reverseLinkedListByRecusion(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode tempNode = reverseLinkedListByRecusion(head.next);
        head.next.next = head;
        head.next = null;
        return tempNode;
    }

    public void showLinkedList(ListNode head) {

        ListNode cur = head;
        while (cur != null) {
            System.out.println("cur value==" + cur.getValue());
            cur = cur.next;
        }
    }



    /**
     * 翻转链表前n个节点
     * @author 沉默的码农
     * @date 2021-03-08 14:52
     * @param [head, number]
     * @return personal.day0120.day0121.ListNode
     */
    //记录需要第n个节点的下一个节点
    ListNode indexNumNode = null;
    public ListNode reverseLinkedNumber(ListNode head,int number) {
        if(number == 1) {
            //第n各节点下一个节点赋值
             indexNumNode = head.next;
            return head;
        }

        ListNode tempNode = reverseLinkedNumber(head.next,number -1);
        //节点翻转
        head.next.next = head;
        //翻转后的节点和原来的节点连起来
        head.next = indexNumNode;
        return tempNode;
    }

    public ListNode reverseBetween(ListNode head,int m,int n) {
        //如果m为1则认为是翻转链表前n个
        if(m == 1) {
            ListNode newHead = reverseLinkedNumber(head,n);
            return newHead;
        }
        head.next = reverseBetween(head.next,m-1,n-1);
        return head;
    }

}
