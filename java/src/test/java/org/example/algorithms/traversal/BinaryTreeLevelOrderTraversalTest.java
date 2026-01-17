package org.example.algorithms.traversal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {
    @Test
    void example1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        
        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), 
                     BinaryTreeLevelOrderTraversal.levelOrder(root));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(1);
        assertEquals(List.of(List.of(1)), BinaryTreeLevelOrderTraversal.levelOrder(root));
    }

    @Test
    void example3() {
        assertEquals(List.of(), BinaryTreeLevelOrderTraversal.levelOrder(null));
    }
}