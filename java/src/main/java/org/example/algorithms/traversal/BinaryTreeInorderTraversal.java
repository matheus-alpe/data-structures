package org.example.algorithms.traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    // https://leetcode.com/problems/binary-tree-inorder-traversal/
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    private static void inorderRecursive(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inorderRecursive(node.left, result);
        result.add(node.val);
        inorderRecursive(node.right, result);
    }

    public static List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;

        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;

            } else {
                TreeNode node = stack.pop();
                result.add(node.val);
                p = node.right;
            }
        }

        return result;
    }

}
