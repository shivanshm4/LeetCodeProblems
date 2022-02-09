package DynamicProgramming.GridTraveller;

import java.util.HashMap;

public class Solution {
    
    static HashMap<String, Long> waysHashMap =  new HashMap<>();
    static long numberOfWaysToTravel(int rowStart, int colStart, int rowEnd, int colEnd, HashMap<String, Long> waysHashMap) {

        if(waysHashMap.containsKey(rowStart+","+colStart)){
            return waysHashMap.get(rowStart+","+colStart);
        }

        if(rowStart > rowEnd || colStart > colEnd) {
             return 0;
        }

        if(rowStart == rowEnd && colStart == colEnd) {
            return 1;
        }

        long res = 0;

        res = numberOfWaysToTravel(rowStart+1, colStart, rowEnd, colEnd, waysHashMap) +  numberOfWaysToTravel(rowStart, colStart+1, rowEnd, colEnd, waysHashMap);
        waysHashMap.put(rowStart+","+colStart, res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numberOfWaysToTravel(1, 1,  18, 18, waysHashMap));
    }
}
