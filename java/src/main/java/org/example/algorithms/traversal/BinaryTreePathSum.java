package org.example.algorithms.traversal;

import java.util.Objects;

public class BinaryTreePathSum {
    // https://leetcode.com/problems/path-sum/description/
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (Objects.isNull(root)) return false;
        if (Objects.isNull(root.left) && Objects.isNull(root.right) && targetSum == root.val) return true;

        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }
}
