package DsaSeries.LinkedList;

public class PalindromeLinkList {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;

        }
        ListNode headSecond = reverseList(slow);
        ListNode reRevese = headSecond;

        while(head!=null && headSecond!=null){
            if(head.val != headSecond.val){
                break;

            }
            head= head.next;
            headSecond= headSecond.next;
        }
        reverseList(reRevese);

        return head==null || headSecond==null;


    }

    public static ListNode  reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }
        head.next = null;
        return current;
    }
}
