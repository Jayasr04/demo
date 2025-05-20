package com.company;

import java.util.Scanner;

class Levenh_dist {
    public static int editDistance(String s1, String s2, int n, int m) {
        // Base cases
        if (n == 0) return m;  // If s1 is empty, insert all characters of s2
        if (m == 0) return n;  // If s2 is empty, remove all characters of s1

        // If last characters are same, no need to do anything
        if (s1.charAt(n - 1) == s2.charAt(m - 1))
            return editDistance(s1, s2, n - 1, m - 1);

        // If last characters are different, consider all three operations:
        int insertOp = editDistance(s1, s2, n, m - 1);   // Insert
        int deleteOp = editDistance(s1, s2, n - 1, m);   // Remove
        int replaceOp = editDistance(s1, s2, n - 1, m - 1); // Replace

        return 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();

        int n = s1.length();
        int m = s2.length();

        System.out.println(editDistance(s1, s2, n, m));
    }
}
