import java.util.*;

import javax.swing.tree.TreeNode;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class Leftview {
    // Function to print the Left View of a Binary Tree
    static void leftView(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node curr = q.poll();
                if (i == 0) {
                    System.out.print(curr.data + " "); // Print the first node at each level
                }
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
    }

    public static Node buildTreeLevelOrder( int nodeCount) {
        System.out.println("Enter node values in level order (use -1 for null nodes):");

        // Read the root value
        Scanner scanner = new Scanner(System.in);
        int rootVal = scanner.nextInt();
        if (rootVal == -1) return null;
        TreeNode root = new TreeNode(rootVal);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            // Left child
            int leftVal = scanner.nextInt();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }
            // Right child
            int rightVal = scanner.nextInt();
            if (rightVal != -1) {
                current.right = new TreeNode(rightVal);
                queue.add(current.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root=
    }
}
