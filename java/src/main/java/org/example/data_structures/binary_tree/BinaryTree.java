package org.example.data_structures.binary_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

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

    // depth-first search
    public boolean dfs(int val) {
        return this.dfsRecursive(val, this.root);
    }

    private boolean dfsRecursive(int val, TreeNode node) {
        if (Objects.isNull(node)) return false;
        if (val == node.value) return true;
        return this.dfsRecursive(val, node.left) || this.dfsRecursive(val, node.right);
    }

    // breadth-first search
    public boolean bfs(int val) {
        if (Objects.isNull(root)) return false;

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.value == val) return true;
            if (Objects.nonNull(node.left)) queue.add(node.left);
            if (Objects.nonNull(node.right)) queue.add(node.right);
        }

        return false;
    }

    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        this.preorderRecursive(this.root, result);
        return result;
    }

    private void preorderRecursive(TreeNode node, List<Integer> result) {
        if (Objects.isNull(node)) return;
        result.add(node.value);
        preorderRecursive(node.left, result);
        preorderRecursive(node.right, result);
    }

    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        this.inorderRecursive(this.root, result);
        return result;
    }

    private void inorderRecursive(TreeNode node, List<Integer> result) {
        if (Objects.isNull(node)) return;
        inorderRecursive(node.left, result);
        result.add(node.value);
        inorderRecursive(node.right, result);
    }

    public List<Integer> postorderTraversal() {
        List<Integer> result = new ArrayList<>();
        this.postorderRecursive(this.root, result);
        return result;
    }

    private void postorderRecursive(TreeNode node, List<Integer> result) {
        if (Objects.isNull(node)) return;
        postorderRecursive(node.left, result);
        postorderRecursive(node.right, result);
        result.add(node.value);
    }
}
