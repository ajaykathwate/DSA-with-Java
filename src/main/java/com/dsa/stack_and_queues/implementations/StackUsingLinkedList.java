package com.dsa.stack_and_queues.implementations;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    private Node top;
    private int size;

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public void push(int value){
        Node node = new Node(value);
        node.next = top;
        top = node;
        System.out.println("Element Pushed: " + value);
        size++;
    }

    public int pop(){
        if(top == null){
            return -1;
        }
        int topData = top.data;
        top = top.next;
        size--;
        return topData;
    }

    public int top(){
        if(top == null) return -1;
        return top.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        Node current = top;
        System.out.print("[ ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args){
        Stack stack = new  Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.printStack();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();
        System.out.println("Top: " + stack.top());
        System.out.println("Size: " + stack.size());
        System.out.println("Is Queue Empty: " + stack.isEmpty());
    }
}
