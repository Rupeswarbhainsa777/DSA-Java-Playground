package DsaSeries.LinkedList;

public class MergeTwoList {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode();

        ListNode list = ans;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                list.next = list1;
                list1 = list1.next;
            } else {
                list.next = list2;
                list2 = list2.next;
            }
            list = list.next;

        }
        while (list1 != null) {
            list.next = list1;
            list1 = list1.next;
            list = list.next;
        }
        while (list2 != null) {
            list.next = list2;
            list2 = list2.next;
            list = list.next;
        }


        return ans.next;

    }

}
