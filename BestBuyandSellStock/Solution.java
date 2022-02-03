package BestBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        
        int minBuy = Integer.MAX_VALUE;
        int maxSell = Integer.MIN_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++ ){
            if(prices[i]<minBuy) {
                minBuy = prices[i];
                continue;
            }
            if(prices[i]-minBuy>maxProfit) {
                maxSell = prices[i];
                maxProfit = maxSell - minBuy;
            }
            
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] prices = {2,1,2,1,0,1,2};
        int profit = obj.maxProfit(prices);
        System.out.println(profit);
    }
}
