/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode result = ans;

        if (list1 == null && list2 == null) {
            return null;
        }

        while (true) {
            if (list1 == null) {
                while (list2 != null) {
                    result.val = list2.val;
                    list2 = list2.next;
                    if (list2 != null) {
                        result.next = new ListNode();
                        result = result.next;
                    }
                }
                break;
            } else if (list2 == null) {
                while (list1 != null) {
                    result.val = list1.val;
                    list1 = list1.next;
                    if (list1 != null) {
                        result.next = new ListNode();
                        result = result.next;
                    }
                }
                break;
            }

            if (list1.val < list2.val) {
                result.val = list1.val;
                list1 = list1.next;
            } else {
                result.val = list2.val;
                list2 = list2.next;
            }
            result.next = new ListNode();
            result = result.next;
        }
        return ans;
    }
}