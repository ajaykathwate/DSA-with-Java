package com.dsa.recursion.basic;

import java.util.Arrays;

class TwoPointers extends Swap{
    protected void reverse(int[] arr, int start, int end){
        if(start >= end) return;

        swap(arr, start, end);

        reverse(arr, start+1, end-1);
    }
}

class SinglePointers extends Swap{
    protected void reverse(int[] arr, int i, int n){
        if(i >= n/2) return;

        swap(arr, i, n-i-1);

        reverse(arr, i+1, n);
    }
}

class Swap{
    protected void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

public class ReverseArray {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{9,8,7,6,5};

        TwoPointers twoPointers = new TwoPointers();
        twoPointers.reverse(arr1, 0, arr1.length-1);

        SinglePointers singlePointers = new SinglePointers();
        singlePointers.reverse(arr2, 0, arr1.length-1);

        System.out.println("Two pointers: \n" + Arrays.toString(arr1));
        System.out.println("Single Pointer: \n" + Arrays.toString(arr2));
    }
}
