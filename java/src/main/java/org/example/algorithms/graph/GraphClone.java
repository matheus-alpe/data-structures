package org.example.algorithms.graph;

import org.example.data_structures.graph.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class GraphClone {
    // https://leetcode.com/problems/clone-graph/description/
    public Node cloneGraph(Node node) {
        if (Objects.isNull(node)) return null;

        HashMap<Integer, Node> lookUp = new HashMap<>();
        lookUp.put(node.val, new Node(node.val, new ArrayList<>()));
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            Node clone = lookUp.getOrDefault(currentNode.val, new Node(currentNode.val, new ArrayList<>()));

            for (Node n : currentNode.neighbors) {
                if (!lookUp.containsKey(n.val)) {
                    lookUp.put(n.val, new Node(n.val, new ArrayList<>()));
                    queue.add(n);
                }
                clone.neighbors.add(lookUp.get(n.val));
            }
        }

        return lookUp.get(node.val);
    }

    public Node cloneGraphDsf(Node node) {
        if (Objects.isNull(node)) return null;
        HashMap<Integer, Node> indexToNode = new HashMap<>();
        return dfs(node, indexToNode);
    }

    public Node dfs(Node node, HashMap<Integer, Node> indexToNode) {
        Node newNode = new Node(node.val);
        indexToNode.put(newNode.val, newNode);

        for (Node neighbor : node.neighbors) {
            Node neighborClone = indexToNode.get(neighbor.val);

            if (neighborClone != null) {
                newNode.neighbors.add(neighborClone);
            } else {
                newNode.neighbors.add(dfs(neighbor, indexToNode));
            }
        }
        return newNode;
    }
}
