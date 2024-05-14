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

import java.util.*;
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger l1ToInt = toRevInt(toList(l1));
        BigInteger l2ToInt = toRevInt(toList(l2));
        BigInteger l3 = l1ToInt.add(l2ToInt);

        return intToListNode(l3);
    }

    public List<Integer> toList(ListNode l) {
        List<Integer> result = new ArrayList<>();

        while (l.next != null) {
            result.add(l.val);
            l = l.next;
        }

        result.add(l.val);
        return result;
    }

    public BigInteger toRevInt(List<Integer> l) {
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < l.size(); i++) {
            result = result.add((BigInteger.valueOf(l.get(i))).multiply(BigInteger.TEN.pow(i)));
        }
        return result;
    }

    public ListNode intToListNode(BigInteger ints) {
        ListNode result = new ListNode();
        ListNode temp = result;
        String str = ints.toString();

        for (int i = str.length() - 1; i > 0; i--) {
            temp.val = str.charAt(i) - '0';
            temp.next = new ListNode();
            temp = temp.next;
        }

        temp.val = str.charAt(0) -'0';
        return result;
    }
}