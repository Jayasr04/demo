import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class VerticalOrder {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        // Map to store nodes based on their vertical positions
        Map<Integer, List<Integer>> verticalMap = new TreeMap<>();

        // Queues for BFS
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> colQueue = new LinkedList<>();

        // Start BFS with root at column 0
        nodeQueue.add(root);
        colQueue.add(0);

        while (!nodeQueue.isEmpty()) {
            TreeNode current = nodeQueue.poll();
            int col = colQueue.poll();

            // Add to vertical map
            verticalMap.putIfAbsent(col, new ArrayList<>());
            verticalMap.get(col).add(current.val);

            // Enqueue left and right children
            if (current.left != null) {
                nodeQueue.add(current.left);
                colQueue.add(col - 1);
            }
            if (current.right != null) {
                nodeQueue.add(current.right);
                colQueue.add(col + 1);
            }
        }

        // Collect the vertical order traversal from sorted columns
        for (List<Integer> column : verticalMap.values()) {
            result.add(column);
        }

        return result;
    }

    // Helper function to build a tree from level-order input
    public static TreeNode buildTreeLevelOrder(Scanner scanner) {
        System.out.println("Enter node values in level order (use -1 for null nodes):");

        Queue<TreeNode> queue = new LinkedList<>();
        int value = scanner.nextInt();
        if (value == -1) return null;

        TreeNode root = new TreeNode(value);
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (scanner.hasNextInt()) {
                int leftVal = scanner.nextInt();
                if (leftVal != -1) {
                    current.left = new TreeNode(leftVal);
                    queue.add(current.left);
                }
            }

            if (scanner.hasNextInt()) {
                int rightVal = scanner.nextInt();
                if (rightVal != -1) {
                    current.right = new TreeNode(rightVal);
                    queue.add(current.right);
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Build tree from level-order input
        TreeNode root = buildTreeLevelOrder(scanner);

        VerticalOrder solution = new VerticalOrder();
        List<List<Integer>> result = solution.verticalOrder(root);

        System.out.println("Vertical Order Traversal:");
        for (List<Integer> column : result) {
            for(int num:column)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
