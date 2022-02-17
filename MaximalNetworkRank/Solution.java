package MaximalNetworkRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        Map<Integer, Integer> networkRank = new HashMap<>();
        Map<Integer, List<Integer>> networkMap = new HashMap<>();
        ArrayList<Integer> neighbours = new ArrayList<>();
        if(roads.length == 0){
            return 0;
        }
        for(int i=0; i<roads.length; i++){
            
            if(networkRank.containsKey(roads[i][0])){
                networkRank.put(roads[i][0], networkRank.get(roads[i][0])+1);
                networkMap.get(roads[i][0]).add(roads[i][1]);
            } else {
                networkRank.put(roads[i][0], 1);
                neighbours = new ArrayList<>();
                neighbours.add(roads[i][1]);
                networkMap.put(roads[i][0], neighbours);    
            }
            if( networkRank.containsKey(roads[i][1])){
                networkRank.put(roads[i][1], networkRank.get(roads[i][1])+1);
                networkMap.get(roads[i][0]).add(roads[i][1]);
            } else {
                networkRank.put(roads[i][1], 1);
                neighbours = new ArrayList<>();
                neighbours.add(roads[i][0]);
                networkMap.put(roads[i][1], neighbours);    
            }
            
        }
        
        int[] arr = new int[networkRank.size()];
        int j =0;
        Arrays.sort(arr);
        int maximalNetworkRank = arr[j-2] + arr[j-1];
        return maximalNetworkRank-1;
    }

    public static void main(String[] args) {
        int[][] roads = {{0,1},{0,3},{1,2},{1,3}, {2,3}, {2,4}};
        Solution obj =new Solution();
        System.out.println(obj.maximalNetworkRank(4, roads));
    }
}
