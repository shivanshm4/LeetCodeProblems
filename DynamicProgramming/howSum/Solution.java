package DynamicProgramming.howSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    List<Integer> howSum(int target, int[] numbers) {
        
        if(target == 0){
            return new ArrayList<Integer>(); 
        }

        if(target<0) {
            return null;
        }
        List<Integer> combination = null;
        for(int i = 0; i<numbers.length; i++) {
            
            combination = howSum(target-numbers[i], numbers);
            if(combination != null){
                combination.add(numbers[i]);
                return combination;
            }
        }

        return combination;
    }


    public static void main(String[] args) {
        int[] numbers= {2,5,3};
        
        System.out.println(new Solution().howSum(8, numbers));
    }

}
