package com.company;

import java.util.*;

public class minstack {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> a = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            s.push(m);
            // Maintain the min stack
            if (a.isEmpty() || m <= a.peek()) {
                a.push(m);
            }
        }
        // Function to get the minimum element
        getMin(a);
        // Perform pop and check min again
        pop(s, a);
        getMin(a);
        // Perform pop and check the topmost element
        pop(s, a);
        s.peek();
        sc.close();
    }
    static void getMin(Stack<Integer> a) {
        if (a.isEmpty())
            System.out.println("Stack is Empty");
        else
            System.out.println("Minimum element: " + a.peek());
    }
    static void pop(Stack<Integer> s, Stack<Integer> a) {
        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        int t = s.pop();
        System.out.println("Removed element: " + t);
        if (!a.isEmpty() && t == a.peek()) {
            a.pop();
        }
    }
}
