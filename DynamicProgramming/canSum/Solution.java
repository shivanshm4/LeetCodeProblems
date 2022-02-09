package DynamicProgramming.canSum;

public class Solution {
    
    static boolean canSum(int target, int[] arr){

        if(target == 0){
            return true;
        }
        boolean res = false;
        for(int i=0; i<arr.length; i++) {
            if(target < arr[i]){
                return false;
            }

            res = canSum(target-arr[i], arr);            
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 9};
        System.out.println(canSum(7, arr));
    }
}
