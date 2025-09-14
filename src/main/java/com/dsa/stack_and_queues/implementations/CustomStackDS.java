package com.dsa.stack_and_queues.implementations;

public class CustomStackDS {
    private final int[] stack;
    private int top;
    private int capacity;

    public CustomStackDS(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value){
        if(top == capacity-1){
            throw new RuntimeException("Stack Overflow Error");
        }
        top++;
        stack[top] = value;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        int temp = stack[top];
        top--;
        return temp;
    }

    public int size(){
        return stack.length;
    }

    public int peek(){
        if(top == -1){
            return top;
        }
        return stack[top];
    }

    public void display(){
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: [ ");
        for(int i = 0; i <= top; i++){
            sb.append(stack[i]).append(" ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    // Using Stack
    public static void main(String[] args){
        CustomStackDS stack = new CustomStackDS(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
        stack.push(40);
        stack.display();
        System.out.println("Size: " + stack.size());

    }
}
