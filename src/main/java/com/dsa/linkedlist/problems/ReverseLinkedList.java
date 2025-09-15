package com.dsa.linkedlist.problems;

import com.dsa.linkedlist.implementation.LinkedList;
import com.dsa.linkedlist.implementation.Node;

public class ReverseLinkedList {

    public static Node reverseLinkedList(Node head){
        Node prev = null;
        Node temp = head;
        while(temp != null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        Node head = LinkedList.convertArrayToLinkedList(arr);
        LinkedList.printLinkedList(head);

        // Reverse Linked List
        Node newNode = reverseLinkedList(head);
        LinkedList.printLinkedList(newNode);
    }
}
