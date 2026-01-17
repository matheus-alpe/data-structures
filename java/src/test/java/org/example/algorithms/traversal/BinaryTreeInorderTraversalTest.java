package org.example.algorithms.traversal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class BinaryTreeInorderTraversalTest {
    private static BinaryTreeInorderTraversal.TreeNode root;
    @BeforeAll
    public static void setUp() {
        root = new BinaryTreeInorderTraversal.TreeNode(1);
        root.right = new BinaryTreeInorderTraversal.TreeNode(2);
        root.right.left = new BinaryTreeInorderTraversal.TreeNode(3);
    }

    @Test
    public void inorderTraversal() {
        var result = BinaryTreeInorderTraversal.inorderTraversal(root);
        assertIterableEquals(List.of(1, 3, 2), result);
    }

    @Test
    public void inorderTraversalIterative() {
        var result = BinaryTreeInorderTraversal.inorderTraversalIterative(root);
        assertIterableEquals(List.of(1, 3, 2), result);
    }
}