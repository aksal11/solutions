public class Solution {

    public static void main(String[] args) {


        ListNode l1 = buildList(new int[]{2,4,3});
        ListNode l2 = buildList(new int[]{5,6,4});

        ListNode result = add(l1, l2);

        printList(result);


    }

    private static ListNode add(ListNode a, ListNode b) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        int carry = 0;

        while (a != null || b != null || carry != 0) {

            int av = (a != null ? a.val : 0);
            int bv = (b != null ? b.val : 0);

            int sum = av + bv + carry;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;

            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        return dummy.next;
    }

    private static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        for (int x : arr) {

            tail.next = new ListNode(x);
            tail = tail.next;
        }

        return dummy.next;
    }

    private static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
