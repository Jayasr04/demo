

import java.util.*;

class permute {
    static boolean check(int ip[], int op[], int n) {
        Stack<Integer> s = new Stack<>();
        int j = 0;

        // Push elements from input to stack
        for (int i = 0; i < n; i++) {
            s.push(ip[i]);

            // Pop elements from stack if they match the output sequence
            while (!s.isEmpty() && s.peek() == op[j]) {
                s.pop();
                j++;
            }
        }

        // If stack is empty, the permutation is valid
        return s.isEmpty();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int input[] = new int[n];
        int output[] = new int[n];

        for (int i = 0; i < n; i++) input[i] = sc.nextInt();
        for (int i = 0; i < n; i++) output[i] = sc.nextInt();

        System.out.println(check(input, output, n) ? "Yes" : "Not Possible");

        sc.close(); // Close the scanner to avoid resource leak
    }
}


