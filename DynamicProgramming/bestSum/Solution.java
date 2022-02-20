package DynamicProgramming.bestSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    
    public static List<Integer> bestSum(int targetSum, int[] arr){
        if(memo.containsKey(targetSum)){
            return memo.get(targetSum);
        }
        if(targetSum == 0){
            return new ArrayList<>();
        }
        if(targetSum < 0) {
            return null;
        }
        List<Integer> bestSum = null;
        for(int i = 0; i<arr.length; i++){
            List<Integer> currentBestSum;
            currentBestSum = bestSum(targetSum - arr[i], arr);
            if(currentBestSum!=null){
                currentBestSum.add(arr[i]);
                if(bestSum == null || bestSum.size() > currentBestSum.size()) {
                    bestSum = currentBestSum;
                }
            }
        }
        memo.put(targetSum, bestSum);
        return bestSum;
    }
    static HashMap<Integer, List<Integer>> memo =  new HashMap<>();
    public static void main(String[] args) {
 //       int[] arr = {5,4,3,7};
 //       int[] arr = {5,3,2};
        int[] arr = {1,2,4,25};
        int targetSum = 100;
        List<Integer> bestSum = bestSum(targetSum, arr);
        System.out.println(bestSum);
    }
}
