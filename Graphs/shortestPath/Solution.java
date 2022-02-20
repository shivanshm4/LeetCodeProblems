package Graphs.shortestPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    HashMap<String, List<String>> adjancencyList = new HashMap<>();

    public int shortestPath(String[][] edges) {
        for (int i = 0; i < edges.length; i++) {
            if (adjancencyList.containsKey(edges[i][0])) {
                List<String> neighbours = adjancencyList.get(edges[i][0]);
                neighbours.add(edges[i][1]);
                adjancencyList.put(edges[i][0], neighbours);
            } else {
                List<String> neighbours = new ArrayList<>();
                neighbours.add(edges[i][1]);
                adjancencyList.put(edges[i][0], neighbours);
            }
            if (adjancencyList.containsKey(edges[i][1])) {
                List<String> neighbours = adjancencyList.get(edges[i][1]);
                neighbours.add(edges[i][0]);
                adjancencyList.put(edges[i][1], neighbours);
            } else {
                List<String> neighbours = new ArrayList<>();
                neighbours.add(edges[i][0]);
                adjancencyList.put(edges[i][1], neighbours);
            }
        }
        int shortestPath = findShortestPath("w", "z");

        return shortestPath;
    }

    HashSet<String> visited = new HashSet<>();
    class Node implements Comparable{
        String node;
        int distance;

        public Node(String node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Object o) {
            // TODO Auto-generated method stub
            return 0;
        }
    }

    public int findShortestPath(String source, String destination) {
        int distance = 0;
        Queue<Node> bfs = new PriorityQueue<Node>();
        Node sourceNode  = new Node( source, distance);
        bfs.add(sourceNode);
        while (!bfs.isEmpty()) {
            Node current = bfs.poll();
            if (current.node.equals(destination)) {
                return current.distance;
            }
            distance += 1;
            for (String neighbour : adjancencyList.get(current.node)) {
                if (!visited.contains(neighbour)) {
                        visited.add(neighbour);
                        Node neighbourNode = new Node(neighbour, distance);
                        bfs.add(neighbourNode);
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        String[][] edges = { { "w", "x" },
                { "x", "y" },
                { "z", "y" },
                { "z", "v" },
                { "w", "v" } };
        Solution obj = new Solution();
        System.out.println(obj.shortestPath(edges));
    }
}
