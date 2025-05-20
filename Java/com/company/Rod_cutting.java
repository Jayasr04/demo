package com.company;

import java.util.Scanner;

class Rod_cutting{
    public static int f(int index, int n, int[] price) {
        // Base Case: if only piece length 1 is allowed (index == 0)
        if (index == 0) {
            return n * price[0]; // take all rods of size 1
        }
        // Not take the current index rod
        int notTake = f(index - 1, n, price);
        // Take the current index rod (only if it fits)
        int take = Integer.MIN_VALUE;
        int rodLength = index + 1;
        if (rodLength <= n) {
            take = price[index] + f(index, n - rodLength, price);
        }
        return Math.max(take, notTake);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // total rod length
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = s.nextInt(); // price[i] is the price for rod length (i+1)
        }
        System.out.println(f(n - 1, n, price));
    }
}
