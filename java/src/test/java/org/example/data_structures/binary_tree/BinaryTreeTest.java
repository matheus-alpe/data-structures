package org.example.data_structures.binary_tree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    private static final BinaryTree tree = new BinaryTree();

    @BeforeAll
    public static void setUp() {
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
    }

    @Test
    public void testSearch() {
        assertTrue(tree.search(4));
        assertFalse(tree.search(10));
    }

    @Test
    public void testPreorderTraversal() {
        System.out.println(tree.preorderTraversal());
        assertIterableEquals(List.of(5, 3, 2, 1, 4, 7, 6, 8), tree.preorderTraversal());
    }

    @Test
    public void testInorderTraversal() {
        System.out.println(tree.inorderTraversal());
        assertIterableEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), tree.inorderTraversal());
    }

    @Test
    public void testPostorderTraversal() {
        System.out.println(tree.postorderTraversal());
        assertIterableEquals(List.of(1, 2, 4, 3, 6, 8, 7, 5), tree.postorderTraversal());
    }
}