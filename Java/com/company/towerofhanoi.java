package com.company;
import java.util.*;

class towerofhanoi {
    
    // Function to implement Tower of Hanoi
    static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            // Base case: Move a single disk
            System.out.println("Move disk " + disk + " from " + from + " to " + to);
            return;
        }

        // Move top (n-1) disks from source to auxiliary using destination
        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + disk + " from " + from + " to " + to);

        // Move the (n-1) disks from auxiliary to destination using source
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int numOfDisks = scanner.nextInt();

        // Call the Tower of Hanoi function
        towerOfHanoi(numOfDisks, 'S', 'A', 'D');
        scanner.close();
    }
}