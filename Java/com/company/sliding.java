package com.company;

import java.util.*;

public class sliding {
    public static void main(String[] args) {
        int arr[] = {20, 1, 78, 90, 57, 89};
        int k = 3; // Window size
        int n = arr.length;

        // Iterate through each window
        for (int i = 0; i <= n - k; i++) {
            int maxVal = arr[i];
            // Find the maximum in the current window
            for (int j = i; j < i + k; j++) {
                if (arr[j] > maxVal) {
                    maxVal = arr[j];
                }
            }
            // Print the maximum for the current window
            System.out.print(maxVal + " ");
        }
    }
}
