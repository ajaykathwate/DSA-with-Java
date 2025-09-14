package com.dsa.recursion.basic;

public class PrintName {
    public static void printName(int n){
        if(n < 1){
            return;
        }
        printName(n-1);
        System.out.printf("Name {%d}", n);
        System.out.println();
    }

    public static void main(String[] args){
        int n = 5;
        printName(n);
    }
}
