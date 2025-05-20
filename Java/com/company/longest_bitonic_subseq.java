package com.company;

import java.util.*;

public class longest_bitonic_subseq {
    public static int longestBitonicSubsequence(int arr[], int n) {
        int inc[] = new int[n];
        int dec[] = new int[n];

        // Step 1: Longest Increasing Subsequence (LIS) till each index
        Arrays.fill(inc, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && inc[i] < inc[j] + 1) {
                    inc[i] = inc[j] + 1;
                }
            }
        }

        // Step 2: Longest Decreasing Subsequence (LDS) from each index
        Arrays.fill(dec, 1);
        for (int i = n-2; i >= 0; i--) {
            for (int j = n-1; j > i; j--) {
                if (arr[i] > arr[j] && dec[i] < dec[j] + 1) {
                    dec[i] = dec[j] + 1;
                }
            }
        }

        // Step 3: Find the maximum of (inc[i] + dec[i] - 1)
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int len = inc[i] + dec[i] - 1;
            if (len > maxLength) {
                maxLength = len;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(longestBitonicSubsequence(arr, n));
    }
}
