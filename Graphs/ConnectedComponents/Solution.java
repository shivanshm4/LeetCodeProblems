package Graphs.ConnectedComponents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Map.Entry;

public class Solution {

    public int connectedComponents(HashMap<Integer, List<Integer>> graph) {

        int connectedComponents = 0;
        Queue<Integer> bfsQueue = new PriorityQueue<>();
        for (Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            if (!isVisited.contains(entry.getKey())) {
                bfsQueue.add(entry.getKey());
                while (!bfsQueue.isEmpty()) {
                    int current = bfsQueue.poll();
                    isVisited.add(current);
                    for (Integer neighbour : graph.get(current)) {
                        if(isVisited.contains(neighbour)) {
                            continue;
                        }
                        bfsQueue.add(neighbour);
                    }
                }
                connectedComponents++;
            } 

        }

        return connectedComponents;
    }

    HashSet<Integer> isVisited = new HashSet<>();

    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        // **** Example 
        // graph.put(2, new ArrayList<Integer>(Arrays.asList(8, 1, 5)));
        // graph.put(1, new ArrayList<Integer>(Arrays.asList(0)));
        // graph.put(5, new ArrayList<Integer>(Arrays.asList(8, 0)));
        // graph.put(8, new ArrayList<Integer>(Arrays.asList(0, 5)));
        // graph.put(2, new ArrayList<Integer>(Arrays.asList(3, 4)));
        // graph.put(3, new ArrayList<Integer>(Arrays.asList(2, 4)));
        // graph.put(4, new ArrayList<Integer>(Arrays.asList(3, 2)));
        graph.put(1, new ArrayList<Integer>(Arrays.asList(2)));
        graph.put(2, new ArrayList<Integer>(Arrays.asList(1)));
        graph.put(6, new ArrayList<Integer>(Arrays.asList(5,8,7,4)));
        graph.put(5, new ArrayList<Integer>(Arrays.asList(6)));
        graph.put(7, new ArrayList<Integer>(Arrays.asList(6)));
        graph.put(8, new ArrayList<Integer>(Arrays.asList(6)));
        graph.put(4, new ArrayList<Integer>(Arrays.asList(6)));
        graph.put(3, new ArrayList<Integer>());
        Solution obj = new Solution();
        System.out.println(obj.connectedComponents(graph));
    }
}
