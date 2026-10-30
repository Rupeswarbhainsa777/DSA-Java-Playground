package Top_Coding_Question.LinkList;

public class FindTheValue {
    public static void main(String[] args) {

    }

    public static int findVal(ListNode head, int t) {
        int res = 0;
        ListNode node = head;

        while (node != null && node.next != null) {
            node = node.next;
            if (node.val == t) {
                res = t;
            }
        }


        return res;
    }
}
