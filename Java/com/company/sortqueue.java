package com.company;

import java.util.*;

public class sortqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        // Taking input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        // Sorting the queue
        queue = sortQueue(queue);

        // Printing sorted queue
        System.out.println("Sorted Queue: " + queue);

        sc.close();
    }

    public static Queue<Integer> sortQueue(Queue<Integer> queue) {
        List<Integer> list = new ArrayList<>(queue);  // Convert queue to list
        Collections.sort(list);  // Sort the list

        Queue<Integer> sortedQueue = new LinkedList<>(list);  // Convert back to queue
        return sortedQueue;
    }
}

