package com.dsa.strings;

public class StringMatchingSubsequence {

    public static int countSubsequences(String s, String[] words) {
        int res = 0;

        for (String str : words) {
            int i = 0;
            int j = 0;

            while (i < str.length() && j < s.length()) {
                if (s.charAt(j) == str.charAt(i)) {
                    i++;
                }
                j++;
            }

            if (i == str.length()) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String[] words = new String[]{"a", "bb", "acd", "ace"};
        int res = countSubsequences(s, words);
        System.out.println("Number of subsequences of given string are " + res);
    }
}
