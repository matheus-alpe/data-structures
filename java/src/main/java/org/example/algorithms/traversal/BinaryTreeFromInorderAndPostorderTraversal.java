package org.example.algorithms.traversal;

public class BinaryTreeFromInorderAndPostorderTraversal {
    static int postLength = 0;

    // https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        postLength = postorder.length - 1;
        return buildTree(inorder, 0, inorder.length - 1, postorder);
    }

    private static TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder) {
        if (inStart > inEnd) {
            return null;
        }
        int rootVal = postorder[postLength--];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder);
        root.left = buildTree(inorder, inStart, rootIndex - 1, postorder);
        return root;
    }
}

