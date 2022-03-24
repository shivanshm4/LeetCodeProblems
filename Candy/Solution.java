package Candy;

class Solution {
    public int candy(int[] ratings) {

        int[] candy = new int[ratings.length];
        int minimumCandy = 0;
        for (int i = 0; i < candy.length; i++) {
            candy[i] = 1;
        }
        for (int i = 0; i < ratings.length; i++) {
            if (i == 0) {
                if (ratings[i + 1] < ratings[i]) {
                    candy[i] = 2;
                } else if (i == ratings.length - 1) {
                    if (ratings[i - 1] < ratings[i]) {
                        candy[i] = 1 + candy[i - 1];
                    }
                } else if (ratings[i - 1] < ratings[i]) {
                    candy[i] = 1 + candy[i - 1];
                }
                if (ratings[i + 1] < ratings[i]) {
                    candy[i] = 1 + candy[i + 1];
                }
            }

        }
        for (int i = 0; i < candy.length; i++) {
            minimumCandy += candy[i];
        }
        return minimumCandy;
    }
}
