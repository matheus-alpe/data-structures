package org.example.algorithms.graph;

import org.example.data_structures.graph.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphCloneTest {
    @Test
    public void testCloneGraph() {
        GraphClone graphClone = new GraphClone();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node clonedGraph = graphClone.cloneGraph(node1);

        assertNotNull(clonedGraph);
        assertEquals(1, clonedGraph.val);
        assertEquals(2, clonedGraph.neighbors.size());

        Node nodeAlone = new Node(1);

        Node clonedGraph2 = graphClone.cloneGraph(nodeAlone);

        assertNotNull(clonedGraph2);
        assertEquals(1, clonedGraph2.val);
        assertTrue(clonedGraph2.neighbors.isEmpty());
    }

    @Test
    public void testCloneGraph_dsf() {
        GraphClone graphClone = new GraphClone();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node clonedGraph = graphClone.cloneGraphDsf(node1);

        assertNotNull(clonedGraph);
        assertEquals(1, clonedGraph.val);
        assertEquals(2, clonedGraph.neighbors.size());

        Node nodeAlone = new Node(1);

        Node clonedGraph2 = graphClone.cloneGraphDsf(nodeAlone);

        assertNotNull(clonedGraph2);
        assertEquals(1, clonedGraph2.val);
        assertTrue(clonedGraph2.neighbors.isEmpty());
    }
}