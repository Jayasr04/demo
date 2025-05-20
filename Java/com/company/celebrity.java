package com.company;
import java.util.*;
public class celebrity {
    public static int findCelebrity(int[][] matrix, int n) {
        Stack<Integer> stack = new Stack<>();
        // Step 1: Push all persons onto the stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }        // Step 2: Determine the potential celebrity
        while (stack.size() > 1) {
            int A = stack.pop();
            int B = stack.pop();

            // If A knows B, A is not a celebrity, push B back
            if (matrix[A][B] == 1) {
                stack.push(B);
            } else { // If A does not know B, then B cannot be a celebrity, push A back
                stack.push(A);
            }
        }
        // Step 3: The last remaining person is a potential celebrity
        int candidate = stack.pop();
        // Step 4: Verify the candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // Check if the candidate knows someone OR someone does not know the candidate
                if (matrix[candidate][i] == 1 || matrix[i][candidate] == 0) {
                    return -1; // No celebrity exists
                }
            }
        }
        return candidate; // Return the celebrity index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the " + n + "x" + n + " adjacency matrix (0s and 1s):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int celebrity = findCelebrity(matrix, n);
        if (celebrity == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("Celebrity is at index: " + celebrity);
        }

        sc.close();
    }
}