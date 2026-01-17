package org.example.algorithms.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    // https://leetcode.com/problems/binary-tree-level-order-traversal/
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
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
                result.add(level);
            }
        }

        return result;
    }
}
