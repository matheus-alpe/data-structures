package org.example.algorithms.traversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeFromInorderAndPostorderTraversalTest {
    @Test
    void testBuildTree() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = BinaryTreeFromInorderAndPostorderTraversal.buildTree(inorder, postorder);

        assertNotNull(root);
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);
        assertEquals(15, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }

}