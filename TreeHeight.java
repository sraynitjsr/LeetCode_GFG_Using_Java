class TreeNode {
    int val;
    TreeNode left, right;
    
    public TreeNode(int value) {
        val = value;
        left = right = null;
    }
}

public class BinaryTreeHeight {
    
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void start() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int treeHeight = height(root);

        System.out.println("Height of the binary tree: " + treeHeight);
    }
}
