package org.example.algorithms.traversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePathSumTest {
    @Test
    public void testHasPathSum() {
        BinaryTreePathSum solution = new BinaryTreePathSum();

        // Test case 1: Tree with a path sum equal to targetSum
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(11);
        root1.left.left.left = new TreeNode(7);
        root1.left.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(13);
        root1.right.right = new TreeNode(4);
        root1.right.right.right = new TreeNode(1);
        assertTrue(solution.hasPathSum(root1, 22));

        // Test case 2: Tree without a path sum equal to targetSum
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        assertFalse(solution.hasPathSum(root2, 5));

        // Test case 3: Empty tree
        assertFalse(solution.hasPathSum(null, 0));

        // Test case 4: Single node tree with matching targetSum
        TreeNode root3 = new TreeNode(7);
        assertTrue(solution.hasPathSum(root3, 7));

        // Test case 5: Single node tree without matching targetSum
        assertFalse(solution.hasPathSum(root3, 10));
    }

}