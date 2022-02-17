package LongestIncreasingSubsequence;

import java.util.HashMap;

public class Solution {
    public int lis(final int[] A) {
        if(A.length <= 1){
            return 1;
        }
        int[] lis = new int[A.length];
        int maxLisLen = Integer.MIN_VALUE;
        for(int i = 0; i<A.length-1; i++) {
            maxLisLen = Math.max(maxLisLen, lisLen(A, i, lis));
        }
        return maxLisLen;
    }
    HashMap<Integer, Integer> memo = new HashMap<>();
    public int lisLen(int[] A, int i, int[] lis){

        if(memo.containsKey(i)){
            return memo.get(i);
        }
        if(i==A.length-1){
            return 1;
        }
        int res = 1;
        for(int index=i+1; index<A.length; index++) {
            if(A[i] < A[index]){
                res = Math.max(res, 1+ lisLen(A, index, lis));
            }
        }
        memo.put(i, res);
        return res;
    }

    public static void main(String[] args) {
        int[] A = {0,1,0,3,2,3};
        System.out.println(new Solution().lis(A));
    }
}
