package DsaSeries.LinkedList;

public class AddTwoNumber {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);

        ListNode tri = res;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = 0 + carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum = sum % 10;

            tri.next = new ListNode(sum);
            tri = tri.next;

        }
        if(carry==1) {
            tri.next = new ListNode(1);
        }
        return res.next;

    }
}
