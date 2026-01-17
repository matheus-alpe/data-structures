package org.example.data_structures.binary_tree;

public class BinaryTree {
    public TreeNode root;

    public void insert(int val) {
        if (this.root == null) {
            this.root = TreeNode.of(val);
            return;
        }

        this.insertRecursive(val, this.root);
    }

    private void insertRecursive(int val, TreeNode node) {
        if (val < node.value) {
            if (node.left == null) {
                node.left = TreeNode.of(val);
            } else {
                this.insertRecursive(val, node.left);
            }
        } else {
            if (node.right == null) {
                node.right = TreeNode.of(val);
            } else {
                this.insertRecursive(val, node.right);
            }
        }
    }

    public boolean search(int val) {
        return this.searchRecursive(val, this.root);
    }

    private boolean searchRecursive(int val, TreeNode node) {
        if (node == null) return false;
        if (val == node.value) return true;
        return this.searchRecursive(val, val < node.value ? node.left : node.right);
    }
}
