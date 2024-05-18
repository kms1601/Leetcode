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
    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> list = new ArrayList();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        if (list.size() == 0) {
            return null;
        }

        k %= list.size();
        ListNode ans = new ListNode();
        ListNode root = ans;
        for (int i = list.size() - k; i < list.size(); i++) {
            root.val = list.get(i);
            root.next = new ListNode();
            root = root.next;
        }

        for (int i = 0; i < list.size() - k - 1; i++) {
            root.val = list.get(i);
            root.next = new ListNode();
            root = root.next;
        }

        root.val = list.get(list.size() - k - 1);
        return ans;
    }
}