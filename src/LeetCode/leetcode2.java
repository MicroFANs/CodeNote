package LeetCode;

import DataStructure.ListNode;
import Utils.Util;

/**
 * Author: Fzx
 * Date: 2021/4/26
 */
public class leetcode2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        int flag = 0; //进位
        int tmp = 0;
        if (l1.val == 0 && l1.next == null) {
            return l2;
        } else if (l2.val == 0 && l2.next == null) {
            return l1;
        } else {
            ListNode l = l1;
            ListNode r = l2;

            while (l != null || r != null) {
                int lv = 0;
                int rv = 0;
                if (l != null) {
                    lv = l.val;
                }
                if (r != null) {
                    rv = r.val;
                }
                tmp = lv + rv + flag;
                if (tmp >= 10) {
                    res.next = new ListNode(tmp - 10);
                    res = res.next;
                    flag = 1;
                } else {
                    res.next = new ListNode(tmp);
                    res = res.next;
                    flag = 0;
                }

                if (l != null) {
                    l = l.next;
                }
                if (r != null) {
                    r = r.next;
                }


            }
            if (flag != 0) {
                res.next = new ListNode(1);
            }

        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode r1 = new ListNode(5);
        ListNode r2 = new ListNode(6);
        ListNode r3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        r1.next = r2;
        r2.next = r3;
        ListNode res = addTwoNumbers(l1, r1);
        Util.showListNode(res);
    }
}
