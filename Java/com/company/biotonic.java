package com.company;
import java.util.*;

public class biotonic {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Function to push a new node at the beginning of the list
    static Node push(Node head, int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    // Function to reverse a doubly linked list
    static Node reverse(Node head) {
        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Move to next node
        }

        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }

    // Function to merge two sorted doubly linked lists
    static Node merge(Node first, Node second) {
        if (first == null) return second;
        if (second == null) return first;

        if (first.data <= second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }

    // Function to sort a bitonic doubly linked list
    static Node sort(Node head) {
        if (head == null || head.next == null) return head;

        Node front = head;
        Node last = head;

        // Find the peak node (point where it starts decreasing)
        while (last.next != null && last.data < last.next.data) {
            last = last.next;
        }

        if (last.next == null) return head; // Already sorted

        // Split into two halves
        Node second = last.next;
        last.next = null;
        if (second != null) second.prev = null;

        // Reverse the decreasing second half
        second = reverse(second);

        // Merge both sorted parts
        return merge(head, second);
    }

    // Function to print a doubly linked list
    static void printList(Node head) {
        if (head == null) {
            System.out.println("Doubly Linked List is empty.");
            return;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Node head = null;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = push(head, value);
        }

        System.out.println("Original List:");
        printList(head);

        head = sort(head);

        System.out.println("After Sorting:");
        printList(head);
    }
}
