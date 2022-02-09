package DynamicProgramming.MatrixTravel;

import java.util.HashMap;

public class Solution {

    static HashMap<String, Integer> waysHashMap =  new HashMap<>();
    static int numberOfWaysToTravelWithoutSomeBlocks(int[][] matrix, int rowStart, int colStart, int rowEnd, int colEnd, HashMap<String, Integer> waysHashMap) {
        
        if(waysHashMap.containsKey(rowStart+","+colStart)){
            return waysHashMap.get(rowStart+","+colStart);
        }

        if(rowStart > rowEnd || colStart > colEnd || matrix[rowStart][colStart] == -1) {
             return 0;
        }

        if(rowStart == rowEnd && colStart == colEnd) {
            return 1;
        }
        int res = 0;

        res += numberOfWaysToTravelWithoutSomeBlocks(matrix, rowStart+1, colStart, rowEnd, colEnd, waysHashMap);
        res += numberOfWaysToTravelWithoutSomeBlocks(matrix, rowStart, colStart+1, rowEnd, colEnd, waysHashMap);
        waysHashMap.put(rowStart+","+colStart, res);
        return res;
    }

    public static void main(String[] args) {

        int[][] matrix =  {{0,0,0}, {0,-1,0}, {0,0,0}};
        System.out.println(numberOfWaysToTravelWithoutSomeBlocks(matrix, 0, 0,  2, 2, waysHashMap));
    }
}
