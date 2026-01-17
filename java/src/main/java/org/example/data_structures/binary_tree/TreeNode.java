package org.example.data_structures.binary_tree;

public class TreeNode{
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.value = val;
    }

    public static TreeNode of(int value) {
        return new TreeNode(value);
    }
}
