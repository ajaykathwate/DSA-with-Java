package com.dsa.recursion.basic;

public class FactorialOfN {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args){
        int n = 3;
        int resultFactorial = factorial(n);
        System.out.println("Factorial of " + n + " is " + resultFactorial);
    }
}
