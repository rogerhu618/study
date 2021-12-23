package com.lenovo;

import java.util.Scanner;
class ListNode {
    public int number;
    ListNode next;
}
public  class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int nodeNum = sc.nextInt();
            System.out.println("nodeNum:" + nodeNum);
            ListNode headNode =  new ListNode();
            headNode.number = sc.nextInt();
            System.out.println("headNode.number:" + headNode.number);
            headNode.next = null;
            for (int i = 0; i < nodeNum-1; i++) {
                int insert = sc.nextInt();
                System.out.println("insert:" + insert);
                int now = sc.nextInt();
                System.out.println("now:" + now);
                //ListNode nowNode = headNode;
                //判断第一个Node符不符合要求
                if (headNode.number == now) {
                    ListNode InsertNode = new ListNode();
                    InsertNode.number = insert;
                    //是否为最后一个Node.
                    if (headNode.next != null) {
                        ListNode afterNode = headNode.next;
                        headNode.next = InsertNode;
                        InsertNode.next = afterNode;
                    } else {
                        headNode.next = InsertNode;
                        InsertNode.next = null;
                    }
                } else {
                    //第一个Node不匹配，继续往下遍历
                    ListNode nowNode = headNode;
                    while (nowNode.next != null) {
                        nowNode = nowNode.next;
                        if (nowNode.number == now) {
                            ListNode InsertNode = new ListNode();
                            InsertNode.number = insert;
                            if (nowNode.next != null) {
                                ListNode afterNode = nowNode.next;
                                nowNode.next = InsertNode;
                                InsertNode.next = afterNode;
                            } else {
                                nowNode.next = InsertNode;
                                InsertNode.next = null;
                            }
                        }
                    }
                }

            }
            //ListNode nowNode = headNode;
            int delete = sc.nextInt();
            if (headNode.number == delete) {
                //极端情况，只有一个Node
                if (headNode.next == null) {
                    System.out.println("");
                } else {
                    //第一Node要被删除，第二个Node成为head Node.
                    headNode = headNode.next;
                }
            }
//            else {
//                ListNode nowNode = headNode;
//                ListNode beforeNode = headNode;
//                while (nowNode.next != null) {
//                    beforeNode = nowNode;
//                    nowNode = nowNode.next;
//                    if (nowNode.number == delete) {
//                        beforeNode.next = nowNode.next;
//                    }
//                }
//            }
            System.out.print(headNode.number);
            if (headNode.next.next != null)
              System.out.print(headNode.next.next.number);
            if (headNode.next != null)
            System.out.print(headNode.next.number);
            if (headNode.next.next.next == null) {
                System.out.println("is null");
            }

            while(headNode.next != null) {
                  headNode = headNode.next;
                System.out.print(" " + headNode.number);
            }
            System.out.println();
       }
    }
}