package com.company;

import java.util.*;

public class LPS {
    public static int longestPalindromicSubsequence(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        int n = s.length();
        return longestCommonSubsequence(s, reversed, n, n);
    }

    public static int longestCommonSubsequence(String s1, String s2, int n, int m) {
        int dp[][] = new int[n + 1][m + 1];

        // Build the LCS dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestPalindromicSubsequence(s));
    }
}
