package com.mao.leetcode.solutions;

import com.mao.leetcode.common.LinkList;
import com.mao.leetcode.common.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 *
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class Solution19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        int i = 0;
        while (i < n) {
            fast = fast.next;
            i++;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = LinkList.createLinkList(10);
        System.out.println(head.toString());
        removeNthFromEnd(head, 5);
        System.out.println(head.toString());
    }
}
