public class BinaryTreeBuilder {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0)
        return null;
        return buildHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private static TreeNode buildHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd)
        return null;

        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);

        int rootIndexInorder = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndexInorder = i;
                break;
            }
        }

        int leftSubtreeSize = rootIndexInorder - inStart;

        root.left = buildHelper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndexInorder - 1);
        root.right = buildHelper(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndexInorder + 1, inEnd);

        return root;
    }

    private static void printInorder(TreeNode node) {
        if (node == null)
        return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    private static void printPreorder(TreeNode node) {
        if (node == null)
        return;        
        System.out.print(node.val + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    private static void printPostorder(TreeNode node) {
        if (node == null)
        return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.val + " ");
    }

    public static void binaryTreeBuilder() {

        int[] preorder1 = {3, 9, 20, 15, 7};
        int[] inorder1 = {9, 3, 15, 20, 7};
        TreeNode tree1 = buildTree(preorder1, inorder1);
        System.out.println("Example 1:");
        System.out.println("Inorder traversal:");
        printInorder(tree1);
        System.out.println("\nPreorder traversal:");
        printPreorder(tree1);
        System.out.println("\nPostorder traversal:");
        printPostorder(tree1);
        System.out.println();

        int[] preorder2 = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder2 = {4, 2, 5, 1, 6, 3, 7};
        TreeNode tree2 = buildTree(preorder2, inorder2);
        System.out.println("\nExample 2:");
        System.out.println("Inorder traversal:");
        printInorder(tree2);
        System.out.println("\nPreorder traversal:");
        printPreorder(tree2);
        System.out.println("\nPostorder traversal:");
        printPostorder(tree2);
    }
}
