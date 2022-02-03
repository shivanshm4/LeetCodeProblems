package Pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> twoDimList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                list.add(1);
            } else if (i == 1) {
                list.add(1);
                list.add(1);
            } else {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == j) {
                        list.add(1);
                    } else {
                        List<Integer> prevList = twoDimList.get(i - 1);
                        list.add(prevList.get(j - 1) + prevList.get(j));
                    }
                }
            }

            twoDimList.add(list);
            list = new ArrayList<>();
        }

        return twoDimList;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.generate(5);
    }
}
