package Top_Coding_Question.LinkList;

public class PrintListItem {

    public static void main(String[] args) {


        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        printList(head);
    }

    public static void printList(ListNode head) {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}