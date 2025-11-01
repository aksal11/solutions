import javax.swing.*;
import java.util.HashSet;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

}

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        // Create linked list: [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                                        new ListNode(5)))));

        ListNode modified = modifiedList(nums,head);
        printList(modified);

    }

    public static ListNode modifiedList(int[] nums, ListNode head){
        HashSet<Integer> set = new HashSet<>();
        for ( int num : nums){
            set.add(num);
        }

        ListNode dup = new ListNode(0);
        dup.next = head;
        ListNode curr = dup;

        while ( curr.next != null){
            if ( set.contains(curr.next.val)){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        return dup.next;
    }

    public static void printList(ListNode head){
        while ( head != null){
            System.out.println(head.val);
                if ( head.next != null) System.out.println(" -> ");
                head = head.next;
            }
            System.out.println();
        }
    }


