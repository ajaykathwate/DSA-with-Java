package com.dsa.stack_and_queues.implementations;

class Queue{
    private final int[] queue;
    private int start, end, capacity, currSize;


    public Queue(int size){
        queue = new int[size];
        capacity = size;
        start = -1;
        end = -1;
        currSize = 0;
    }

    public void push(int value){
        if (currSize == capacity){
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }
        if(end == -1){
            start = 0;
            end = 0;
        }else{
            end = (end + 1) % capacity;
        }
        queue[end] = value;
        System.out.println("The element pushed is " + value);
        currSize++;
    }

    public int pop(){
        if (start == -1){
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }
        int popped = queue[start];
        if(currSize == 1){
            start = -1;
            end = -1;
        }else{
            start = (start + 1) % capacity;
        }
        currSize--;
        return popped;
    }

    public int top() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return queue[start];
    }

    public int size() {
        return currSize;
    }

    public void display(){
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: [ ");
        for(int i = start; i <= end; i++){
            sb.append(queue[i]).append(" ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}

public class QueueDemo {
    public static void main(String[] args){
        Queue q = new Queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        q.display();
        System.out.println("The first element to be deleted " + q.pop());
        q.display();

    }
}


