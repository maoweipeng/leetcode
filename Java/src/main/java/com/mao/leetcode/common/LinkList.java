package com.mao.leetcode.common;

public class LinkList {

    public static ListNode createLinkList(int length) {
        ListNode head = null;
        for (int i = 0; i < length; i++) {
            if (head == null) {
                head = new ListNode(i);
                continue;
            }

            insert(head, new ListNode(i));
        }

        return head;
    }

    /**
     * insert
     *
     * @param head
     * @param node
     * @return
     */
    public static ListNode insert(ListNode head, ListNode node) {
        if (head == null) {
            return node;
        }

        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;

        return head;
    }

    /**
     * delete
     *
     * @param head
     * @param value
     * @return
     */
    public static ListNode delete(ListNode head, int value) {
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == value) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }

        return head;
    }

    /**
     * update
     *
     * @param head
     * @param oldValue
     * @param newValue
     * @return
     */
    public static ListNode update(ListNode head, int oldValue, int newValue) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == oldValue) {
                cur.val = newValue;
                break;
            }
            cur = cur.next;
        }

        return head;
    }
}
