package com.licou;
//反转链表
//迭代
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode cur = head, prev = null;
//        while (cur != null) {
//            ListNode next = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = next;
//        }
//        return prev;
//    }
//}

//递归
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        return op(head, null);
//    }
//
//    public ListNode op(ListNode cur, ListNode prev) {
//        if (cur == null) return prev;
//        ListNode nt = cur.next;
//        cur.next = prev;
//        return op(nt, cur);
//    }
//}
public class fzlb {
//    class Solution {
//        public ListNode reverseList(ListNode head) {
//            ListNode pre=null;ListNode cur=head;ListNode tmp;
//            while(cur!=null)
//            {
//                tmp=cur.next;
//                cur.next=pre;
//                pre=cur;
//                cur=tmp;
//            }
//            return pre;
//
//        }
//    }
}
