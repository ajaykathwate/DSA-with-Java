package com.dsa.recursion.basic;

abstract class PrintNumberNTimes{
    public abstract void printN(int n);
}

class PrintNForward extends PrintNumberNTimes{
    /*
     * Print from 1 -> N
     */
    public void printN(int n){
        if(n < 1){
            return;
        }
        printN(n-1);
        System.out.println("N" + n);
    }
}

class PrintNBackward extends PrintNumberNTimes{
    /*
     * Print from N -> 1
     */
    public void printN(int n){
        if(n < 1){
            return;
        }
        System.out.println("N" + n);
        printN(n-1);
    }
}

public class PrintNTimes{

    public static void main(String[] args){
        int n = 5;
        PrintNForward printNForward = new PrintNForward();
        PrintNBackward printNBackward = new PrintNBackward();

        System.out.println("From 1 - N:");
        printNForward.printN(n);

        System.out.println("From N - 1:");
        printNBackward.printN(n);
    }
}
