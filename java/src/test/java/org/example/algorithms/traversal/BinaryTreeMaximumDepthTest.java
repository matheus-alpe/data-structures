package org.example.algorithms.traversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumDepthTest {
    @Test
    public void testMaxDepth() {
        BinaryTreeMaximumDepth solver = new BinaryTreeMaximumDepth();

        // Test case 1: Empty tree
        assertEquals(0, solver.maxDepth(null));

        // Test case 2: Single node tree
        TreeNode root1 = new TreeNode(1);
        assertEquals(1, solver.maxDepth(root1));

        // Test case 3: Balanced tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        assertEquals(3, solver.maxDepth(root2));

        // Test case 4: Unbalanced tree
        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(2);
        root3.right.right = new TreeNode(3);
        assertEquals(3, solver.maxDepth(root3));
    }

    @Test
    public void testMaxDepth_recursive() {
        BinaryTreeMaximumDepth solver = new BinaryTreeMaximumDepth();

        // Test case 1: Empty tree
        assertEquals(0, solver.maxDepthRecursive(null));

        // Test case 2: Single node tree
        TreeNode root1 = new TreeNode(1);
        assertEquals(1, solver.maxDepthRecursive(root1));

        // Test case 3: Balanced tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        assertEquals(3, solver.maxDepthRecursive(root2));

        // Test case 4: Unbalanced tree
        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(2);
        root3.right.right = new TreeNode(3);
        assertEquals(3, solver.maxDepthRecursive(root3));
    }
}