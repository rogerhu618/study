package com.lenovo;
import java.util.ArrayList;
import java.util.Stack;
/*
反转链表实现
 */
public class Solution {
    /*
    链表的节点对象
     */
    private class ListNode {
        public int val;
        public ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }
    //算法
    public ListNode ReverseList(ListNode head) {
        //stack,用来实现链表反转
        Stack<ListNode> st = new Stack<ListNode>();
        ListNode nextNode = head.next;
        st.push(head);
        while(nextNode !=null){
            st.push(nextNode);
            nextNode = nextNode.next;
        }
        System.out.println("==========> stack:" + st);
        //新的链表head
        ListNode newHead = st.pop();
        System.out.println("===========> newHead:" + newHead);
        ListNode current = newHead;
        while (!st.empty()) {
            ListNode node = st.pop();
            current.next = node;
            current = node;
        }
        current.next = null;
        System.out.println("============> new node1:" + newHead);
        System.out.println("============> new node2:" + newHead.next);
        System.out.println("============> new node3:" + newHead.next.next);
        return newHead;
    }
    public static void main(String[] args) {
        ListNode node1 = new Solution().new ListNode(1);
        ListNode node2 = new Solution().new ListNode(2);
        ListNode node3 = new Solution().new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        System.out.println("============> node1:" + node1);
        System.out.println("============> node2:" + node1.next);
        System.out.println("============> node3:" + node1.next.next);
        Solution sol = new Solution();
        ListNode head = sol.ReverseList(node1);
        ListNode current = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(head.val);
        while(current.next!=null) {
            ListNode node = current.next;
            list.add(node.val);
            current = node;
        }
        System.out.println("===========> list: " + list);
    }
}
