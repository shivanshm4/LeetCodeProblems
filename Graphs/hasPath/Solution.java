package Graphs.hasPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    public boolean hasPath(String source, String destination) {

        Stack<String> dfs = new Stack<>();

        dfs.push(source);
        
        while(!dfs.empty()) {
            String current = dfs.pop(); 
            if(current.equals(destination)) {
                return true;
            } else {
                for(String neighbour : graph.get(current)){
                    dfs.push(neighbour);
                }
            }
        }
        return false;
    }

    public boolean hasPathStackRecursive(String source, String destination) {
        
        if(source.equals(destination)){
            return true;
        }

        for(String neighbour: this.graph.get(source)){
            if(hasPathStackRecursive(neighbour, destination)){
                return true;
            }
        }

        return false;
    }

    public boolean hasPathBFS(String source, String destination) {

        if(source.equals(destination)) {
            return true;
        }
        Queue<String> bfs =  new PriorityQueue<>();
        bfs.add(source);
        while(!bfs.isEmpty()){
            String current = bfs.poll();
            if(current.equals(destination)) {
                return true;
            }
            for(String neighbor : graph.get(current)){
                bfs.add(neighbor);
            }
        }

        return false;
    }
    HashMap<String, List<String>> graph;
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.graph = new HashMap<>();
        obj.graph.put("f", new ArrayList<String>( Arrays.asList("g", "i")));
        obj.graph.put("g", new ArrayList<String>( Arrays.asList("h")));
        obj.graph.put("h", new ArrayList<String>());
        obj.graph.put("i", new ArrayList<String>( Arrays.asList("g","k")));
        obj.graph.put("j", new ArrayList<String>( Arrays.asList("i")));
        obj.graph.put("k", new ArrayList<String>());
        System.out.println(obj.hasPath("f", "j"));
        System.out.println(obj.hasPathStackRecursive("f", "k"));
        System.out.println(obj.hasPathBFS("f", "k"));
    }
    
}
