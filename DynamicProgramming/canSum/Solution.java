package DynamicProgramming.canSum;

public class Solution {
    
    static boolean canSum(int target, int[] arr){

        if(target == 0){
            return true;
        }

        if(target < 0) {
            return false;
        }
        boolean res = false;
        for(int i=0; i<arr.length; i++) {
            res = canSum(target-arr[i], arr);
            if(res == true) {
                return true;
            }            
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,3};
        System.out.println(canSum(7, arr));
    }
}
