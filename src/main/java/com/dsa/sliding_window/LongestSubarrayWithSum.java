package com.dsa.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubarrayWithSum {

    // Very Brute Force - Generate Subarrays and storing then and again counting then
    public static Map<List<Integer>, Integer> longestSubArrayWithSum(int[] arr, int targetSum){
        List<List<Integer>> subArrays = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                List<Integer> l = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    l.add(arr[k]);
                }
                subArrays.add(l);
            }
        }
        Map<List<Integer>, Integer> map = new HashMap<>();
        int indexLength = Integer.MIN_VALUE;
        for (List<Integer> subArr: subArrays){
            int arrSum = subArr.stream().reduce(0, (a,b)-> a+b);
            if(arrSum == targetSum && indexLength < subArr.size()){
                map.put(subArr, arrSum);
                indexLength = subArr.size();
            }
        }
        return map;
    }

    // Brote Force - Generate all sub arrays
    public static int longestSubArrayWithSumBruteForce(int[] arr, int targetSum){
        int maxLength = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum <= targetSum) {
                    maxLength = Math.max(maxLength, j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxLength;
    }

    // Using two pointers and sliding window
    public static int longestSubArrayWithSumBetter(int[] arr, int targetSum){
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        while(r < arr.length){
            sum = sum + arr[r];

            while(sum > targetSum){
                sum = sum - arr[l];
                l = l + 1;
            }

            if(sum <= targetSum){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r = r + 1;
        }
        return maxLen;
    }

    // Optimal - Replace "while" with "if"
    public static int longestSubArrayWithSumOptimal(int[] arr, int targetSum){
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        while(r < arr.length){
            sum = sum + arr[r];

            if(sum > targetSum){
                sum = sum - arr[l];
                l = l + 1;
            }

            if(sum <= targetSum){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r = r + 1;
        }
        return maxLen;
    }

    public static void main(String[] args){
        int[] arr = {2, 5, 1, 7, 10};
        int k = 14;
        int result = longestSubArrayWithSumOptimal(arr, k);
        System.out.println(result);
    }
}
