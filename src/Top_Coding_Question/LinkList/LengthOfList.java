package Top_Coding_Question.LinkList;

public class LengthOfList {
    public static void main(String[] args) {

    }

    public static int lengthList(ListNode head) {

        ListNode node = head;

        int res = 0;
        while (node != null && node.next != null) {

            node = node.next;
            res++;

        }
        return res;
    }
}
