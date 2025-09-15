package com.dsa.linkedlist.implementation;

public class LinkedList {

    public static void printLinkedList(Node head){
        Node temp = head;
        System.out.print("[ ");
        while(temp != null){
            if(temp.next == null){
                System.out.print(temp.value);
            }else{
                System.out.print(temp.value + ", ");
            }
            temp = temp.next;
        }
        if(head == null) System.out.print("null");
        System.out.println(" ]");
    }

    public static boolean contains(Node head, int target){
        Node temp = head;
        while(temp != null){
            if(temp.value == target) return true;
            temp = temp.next;
        }
        return false;
    }

    public static Node convertArrayToLinkedList(int[] arr){
        if(arr.length == 0){
            return null;
        }

        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1; i < arr.length; i++){
            Node node =new Node(arr[i]);
            temp.next = node;
            temp = node;
        }
        return head;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        Node head = convertArrayToLinkedList(arr);
        printLinkedList(head);
        String res = (contains(head, 2) ? "Yes" : "No" );
        System.out.println("Does LinkedList contains " + 2 + " ? " + res);
    }
}
