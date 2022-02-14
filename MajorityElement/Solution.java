package MajorityElement;

import java.util.HashMap;

public class Solution {
    public int majorityElement(final int[] A) {

        if(A.length <= 1) {
            return A[0];
        }
        HashMap<Integer, Integer> elementMap = new HashMap<Integer, Integer>();
        for( int i = 0; i<A.length; i++){
            if(elementMap.containsKey(A[i])){
                elementMap.put(A[i], elementMap.get(A[i])+1);
                System.out.println(A[i] + " " +elementMap.get(A[i]));
                if(elementMap.get(A[i])>Math.floor(A.length/2)) {
                    return A[i];
                }
            } else {
                elementMap.put(A[i], 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1,1,1,2,2};
        System.out.println(new Solution().majorityElement(A));
    }
}
