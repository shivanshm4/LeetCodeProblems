package DynamicProgramming.MinCostClimbingStairs;

import java.util.HashMap;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return minimumCost(cost, 0);
    }
    HashMap<Integer, Integer> memo = new HashMap<>();
    public int minimumCost(int[] cost, int index){
        if(memo.containsKey(index)){
            return memo.get(index);
        }
        if(index > cost.length-1) {
            return 0;
        }
        
        if(cost.length == 1) {
            return cost[0];
        }

        if(cost.length <= 3){
            return Math.min(cost[0], cost[1]);
        }
        int sum = 0;
            sum =  Math.min(cost[index] + minimumCost(cost, index+2), cost[index] + minimumCost(cost, index+1));
            memo.put(index, sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(new Solution().minCostClimbingStairs(cost));
    }
}
