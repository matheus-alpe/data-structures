package org.example.algorithms.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class BinaryTreeSameTree {
    // https://leetcode.com/problems/same-tree/description
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (Objects.isNull(p) && Objects.isNull(q)) return true;
        if (Objects.isNull(p) || Objects.isNull(q)) return false;
        if (p.val != q.val) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i+=2) {
                TreeNode nodeP = queue.poll();
                TreeNode nodeQ = queue.poll();

                if (nodeP.val != nodeQ.val) return false;

                if (Objects.nonNull(nodeP.left) || Objects.nonNull(nodeQ.left)) {
                    if (Objects.isNull(nodeP.left) || Objects.isNull(nodeQ.left)) return false;
                    queue.add(nodeP.left);
                    queue.add(nodeQ.left);
                };
                if (Objects.nonNull(nodeP.right) || Objects.nonNull(nodeQ.right)) {
                    if (Objects.isNull(nodeP.right) || Objects.isNull(nodeQ.right)) return false;
                    queue.add(nodeP.right);
                    queue.add(nodeQ.right);
                };
            }
        }

        return true;
    }

    public boolean isSameTreeRecursive(TreeNode p, TreeNode q) {
        if (Objects.isNull(p) && Objects.isNull(q)) return true;
        if (Objects.isNull(p) || Objects.isNull(q)) return false;
        if (p.val != q.val) return false;

        return isSameTreeRecursive(p.left, q.left) && isSameTreeRecursive(p.right, q.right);
    }
}
