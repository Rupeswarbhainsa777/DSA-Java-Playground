package DsaSeries.LinkedList;

public class ReverseTwo {
    public static void main(String[] args) {

    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (head != null || head.next != null || left == right) return head;

        ListNode current = head;
        ListNode prev = null;
        int i = 0;
        while (i != left) {
            prev = current;
            current = current.next;
            i++;
        }
        ListNode pointToSt = prev;
        ListNode start = current;

        while (i <= right) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }

        if (pointToSt != null) {
            pointToSt.next = prev;
        } else {
            head=prev;
        }

        start.next = current;


        return head;


    }
}
