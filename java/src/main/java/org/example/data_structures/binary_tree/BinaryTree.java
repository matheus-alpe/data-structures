package org.example.data_structures.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
            if (Objects.isNull(node.left)) {
                node.left = TreeNode.of(val);
            } else {
                this.insertRecursive(val, node.left);
            }
        } else {
            if (Objects.isNull(node.right)) {
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
        if (Objects.isNull(node)) return false;
        if (val == node.value) return true;
        return this.searchRecursive(val, val < node.value ? node.left : node.right);
    }

    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        this.preorderRecursive(this.root, result);
        return result;
    }

    private void preorderRecursive(TreeNode node, List<Integer> result) {
        if (Objects.nonNull(node)) {
            result.add(node.value);
            preorderRecursive(node.left, result);
            preorderRecursive(node.right, result);
        }
    }
}
