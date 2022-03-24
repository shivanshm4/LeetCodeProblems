package DynamicProgramming.coinChange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.omg.CORBA.CurrentOperations;

public class Solution {

    List<List<Integer>> allMakeList =  new ArrayList<>();

    HashMap<Integer, Boolean> memoCanMake = new HashMap<>();
    HashMap<Integer, Integer> memoCountMake = new HashMap<>();

    private boolean canMake(int[] coins, int target){

        if(memoCanMake.containsKey(target)){
            return memoCanMake.get(target);
        }

        if(target<0){
            return false;
        }

        if(target == 0){
            return true;
        }

        boolean canMake = false;
        for(int i = 0; i<coins.length; i++){
            int newTarget = target - coins[i];

            if(canMake(coins, newTarget)){
                canMake = true;
                memoCanMake.put(target, true);
                return true;
            }
        }
        memoCanMake.put(target, false);
        return canMake;
    }

    private int countMake(int[] coins, int target){

        if(memoCountMake.containsKey(target)){
            return memoCountMake.get(target);
        }

        if(target<0){
            return -1;
        }
        if(target == 0){
            return 1;
        }

        int countMake = 0;

        for(int i = 0; i<coins.length; i++){
            int newTarget = target - coins[i];

            countMake += Math.max(0,countMake(coins, newTarget));
        }

        memoCountMake.put(target, countMake);
        return countMake;
    }

    private List<Integer> allMake(int[] coins, int target){
        
        if(target == 0){
            return new ArrayList<>();
        }

        if(target < 0) {
            return null;
        }
        List<Integer> current = null;
        for(int i = 0; i<coins.length; i++){
            int newTarget = target - coins[i];
            current = allMake(coins, newTarget);
            if(current != null){
                current.add(coins[i]);
            }
        }
        allMakeList.add(current);
        return current;
    }
    public static void main(String[] args) {
        int[] coins = {2,5,3};
        int targetTrue = 10;
        int targetTrue2 = 11;

        Solution obj = new Solution();
        System.out.println(obj.canMake(coins, targetTrue));
        System.out.println(obj.canMake(coins, targetTrue2));
        System.out.println(obj.countMake(coins, targetTrue));
        obj.allMake(coins, targetTrue);
        System.out.println(obj.allMakeList);
    }
}
