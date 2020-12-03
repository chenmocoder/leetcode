package personal.day0120.day0121;

public class LinkedList {

    public int size;

    public ListNode head;   //头部节点

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public void insertNode(Object obj) {
        ListNode node = new ListNode(obj);
        if(this.size == 0) {
            head = node;
        } else {
            head.next = node;
        }
        this.size++;
    }



}
