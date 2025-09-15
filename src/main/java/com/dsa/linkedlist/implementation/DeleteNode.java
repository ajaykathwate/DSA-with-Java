package com.dsa.linkedlist.implementation;

public class DeleteNode {
    // Removes head of LL i.e. first element
    public static Node removeHead(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }

    // Removes tail of LL i.e. last element
    public static Node removeTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteKthNode(Node head, int k){
        if(head == null || k <= 0) return null;
        if (k == 1) {
            return head.next;
        }

        int counter = 1;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(k == counter){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            counter++;
        }
        return head;
    }

    public static Node deleteValueNode(Node head, int value){
        if(head == null ) return null;
        if (head.value == value) {
            return head.next;
        }

        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.value == value){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args){
        // Create a linked list from the array: 1 → 2 → 3 → 4 → 5
        int[] arr = new int[]{1,2,3,4,5};
        Node head = LinkedList.convertArrayToLinkedList(arr);
        LinkedList.printLinkedList(head);

        // Remove the head node (value 1)
        Node newHead = removeHead(head);

        // Remove the tail node (value 5) from the list that now starts at value 2
        // This also mutates the nodes that 'head' points to because the list shares node references.
        newHead = removeTail(newHead);
        LinkedList.printLinkedList(newHead);

        // ---- Delete the 2nd node in the *original list* referenced by 'head' ----
        // Even though we call deleteKthNode on 'head',
        // the previous tail deletion already removed value 5 from the shared nodes.
        // So the list starting at 'head' is effectively: 1 → 2 → 3 → 4
        // Deleting the 2nd node removes value 2.
        newHead = deleteKthNode(newHead, 2);
        LinkedList.printLinkedList(newHead);

        // ---- Delete node by value ----
        // Remove the node whose value is 4 from the current list.
        newHead = deleteValueNode(newHead, 4);
        LinkedList.printLinkedList(newHead);
    }
}
