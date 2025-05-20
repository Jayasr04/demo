package com.company;
import java.util.Scanner;

public class priority {
    private static int[] values;
    private static int[] priority;
    private static int size;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        values = new int[n];
        priority = new int[n];
        size = 0;  // Track current size of queue

        for (int i = 0; i < n; i++) {
            push(scanner.nextInt(), scanner.nextInt());
        }

        System.out.println(peek()); // Peek at the highest-priority element
        System.out.println(pop());  // Pop the highest-priority element
        System.out.println(pop());  // Pop the next highest-priority element
        System.out.println(peek()); // Peek at the current highest-priority element
    }

    // Push function to insert elements in sorted order
    private static void push(int data, int prio) {
        if (size == values.length) {
            System.out.println("Queue is full");
            return;
        }

        int i = size - 1;
        // Shift elements to maintain descending priority order
        while (i >= 0 && priority[i] < prio) {
            values[i + 1] = values[i];
            priority[i + 1] = priority[i];
            i--;
        }

        values[i + 1] = data;
        priority[i + 1] = prio;
        size++;
    }

    // Peek function to get the highest-priority element
    private static int peek() {
        return (size > 0) ? values[0] : -1;
    }

    // Pop function to remove and return the highest-priority element
    private static int pop() {
        if (size == 0) return -1;
        int val = values[0];

        // Shift elements left to remove the first element
        for (int i = 0; i < size - 1; i++) {
            values[i] = values[i + 1];
            priority[i] = priority[i + 1];
        }

        size--;
        return val;
    }
}
