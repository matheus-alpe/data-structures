package org.example.algorithms.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class BinaryTreeMaximumDepth {
    // https://leetcode.com/problems/maximum-depth-of-binary-tree/description
    public int maxDepth(TreeNode root) {
        int result = 0;
        if (Objects.isNull(root)) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (Objects.nonNull(node.left)) queue.add(node.left);
                if (Objects.nonNull(node.right)) queue.add(node.right);
            }

            if (!level.isEmpty()) {
                result++;
            }
        }

        return result;
    }

    public int maxDepthRecursive(TreeNode root) {
        if (Objects.isNull(root)) return 0;

        int leftDepth = maxDepthRecursive(root.left);
        int rightDepth = maxDepthRecursive(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
