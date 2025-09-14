package com.dsa.recursion.basic;

public class SumNNumbers {

    public static void parameterizedSum(int n, int sum){
        if(n < 1){
            System.out.println("Parameterized Sum is " + sum);
            return;
        }
        parameterizedSum(n-1, sum+n);
    }

    public static int functionalSum(int n){
        if(n == 0){
            return 0;
        }
        return n + functionalSum(n-1);
    }

    public static void main(String[] args){
        int n = 3;
        // parameterizedSum(n, 0);
        int resultSum = functionalSum(n);
        System.out.println("Functional Sum is " + resultSum);
    }

}
