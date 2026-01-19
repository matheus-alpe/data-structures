package org.example.algorithms.traversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeSameTreeTest {

    @Test
    public void example1() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(new BinaryTreeSameTree().isSameTree(p, q));
    }

    @Test
    public void example2() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
        assertFalse(new BinaryTreeSameTree().isSameTree(p, q));
    }

    @Test
    public void example3() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        assertFalse(new BinaryTreeSameTree().isSameTree(p, q));
    }

    @Test
    public void emptyTrees() {
        assertTrue(new BinaryTreeSameTree().isSameTree(null, null));
    }

    @Test
    public void example1_recursive() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(new BinaryTreeSameTree().isSameTreeRecursive(p, q));
    }

    @Test
    public void example2_recursive() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
        assertFalse(new BinaryTreeSameTree().isSameTreeRecursive(p, q));
    }

    @Test
    public void example3_recursive() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        assertFalse(new BinaryTreeSameTree().isSameTreeRecursive(p, q));
    }

    @Test
    public void emptyTrees_recursive() {
        assertTrue(new BinaryTreeSameTree().isSameTreeRecursive(null, null));
    }
}