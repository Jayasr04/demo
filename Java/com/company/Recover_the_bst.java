package com.company;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    static void printInorder(TreeNode node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(" " + node.val);
        printInorder(node.right);
    }
}
public class Recover_the_bst {
    public static TreeNode buildTreeLevelOrder(Scanner scanner, int nodeCount, ArrayList<Integer> arr) {
        System.out.println("Enter node values in level order (use -1 for null nodes):");

        // Read the root value
        int rootVal = scanner.nextInt();
        if (rootVal == -1) return null;
        arr.add(rootVal);
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
                    arr.add(leftVal);
            }
            // Right child
                int rightVal = scanner.nextInt();
                if (rightVal != -1) {
                    current.right = new TreeNode(rightVal);
                    queue.add(current.right);
                    arr.add(rightVal);
            }
        }
        return root;
    }

    public static TreeNode build(int nodecount , ArrayList<Integer> arr){
        Scanner sc = new Scanner(System.in);
        int rootval = sc.nextInt();
        if(rootval == -1){
            return null;
        }
        TreeNode root = new TreeNode(rootval);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int nodes = 1;
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            if(nodes < nodecount){
                int leftval = sc.nextInt();
                if(leftval!=-1){
                    current.left = new TreeNode(leftval);
                    q.add(current.left);
                    nodes++;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number of nodes
        System.out.println("Enter the number of nodes in the tree:");
        int nodeCount = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        // Build tree from level-order input
        TreeNode root = buildTreeLevelOrder(scanner, nodeCount, arr);
        System.out.println("Inorder before recovery:");
        Solution.printInorder(root);
        System.out.println();
        Collections.sort(arr);
        // Recover the BST
        Solution solution = new Solution();
        System.out.println("Inorder after recovery:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}