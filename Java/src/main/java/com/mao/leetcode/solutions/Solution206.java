package com.mao.leetcode.solutions;

import com.mao.leetcode.common.LinkList;
import com.mao.leetcode.common.ListNode;

/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution206 {
    /**
     * 迭代方式
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode newHead = null;
        while (cur != null) {
            ListNode other = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = other;
        }

        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = LinkList.createLinkList(10);
        System.out.println(head.toString());

        head = reverseList(head);

        System.out.println(head.toString());
    }
}
