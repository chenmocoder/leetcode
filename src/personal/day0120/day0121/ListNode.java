package personal.day0120.day0121;

import java.util.List;

public class ListNode {

        Object value;
        ListNode next;

        public ListNode(Object x) {
            this.value = x;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

    public Object getValue() {
        return value;
    }

    public ListNode getNext() {
        return this.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        return null;
    }
}
