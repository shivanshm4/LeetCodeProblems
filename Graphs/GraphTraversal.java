package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversal {

    List<String> neighbours = new ArrayList<>();

    Stack<String> dfsStack = new Stack<>();

    void dfs(Map<String, List<String>> graph) {

        if (dfsStack.isEmpty()) {
            return;
        }
        System.out.println(dfsStack.peek());
        neighbours = graph.get(dfsStack.peek());
        dfsStack.pop();
        if(neighbours == null){
            dfs(graph);
        } else {
            for (String nodeNeighbour : neighbours) {
                dfsStack.push(nodeNeighbour);
            }
            dfs(graph);
        }
        
    }   
    Queue<String> bfsQueue = new  PriorityQueue<>();
    void bfs(Map<String, List<String>> graph){

        if(bfsQueue.isEmpty()){
            return;
        }
        System.out.println(bfsQueue.peek());
        List<String> neighbours = graph.get(bfsQueue.peek());
        bfsQueue.poll();
        if(neighbours == null) {
            bfs(graph);
        } else{
            for(String node: neighbours) {
                bfsQueue.offer(node); 
            }
            bfs(graph);
        }
        
    }

    public static void main(String[] args) {
        HashMap<String, List<String>> graph = new HashMap<>();
        ArrayList<String> neighbourList = new ArrayList<>();
        neighbourList.add("b");
        neighbourList.add("c");
        graph.put("a", neighbourList);
        neighbourList = new ArrayList<>(0);
        neighbourList.add("d");
        graph.put("b", neighbourList);
        neighbourList = new ArrayList<>();
        neighbourList.add("e");
        graph.put("c", neighbourList);

        System.out.println(graph);

        GraphTraversal obj = new GraphTraversal();
        obj.dfsStack.push("a");
        obj.dfs(graph);
        obj.bfsQueue.offer("a");
        obj.bfs(graph);
    }
}
