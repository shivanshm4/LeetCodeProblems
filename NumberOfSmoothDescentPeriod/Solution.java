package NumberOfSmoothDescentPeriod;


public class Solution {
    public long getDescentPeriods(int[] prices) {
        long currentDescent = 0;
        long descentPeriod = prices.length;
       for(int i = 1; i <prices.length; i++) {
            if(prices[i]-prices[i-1] == -1){
                currentDescent += 1;
            }else if(prices[i]-prices[i-1] != -1 ){
                currentDescent = 0;
            }

            descentPeriod += currentDescent; 
        }
        
        return descentPeriod;
    }
    public static void main(String[] args) {
        int[] prices = {12,11,10,9,8,7,6,5,4,3,4,3,10,9,8,7};
        Solution obj = new Solution();
        System.out.println(obj.getDescentPeriods(prices));
    }
}
