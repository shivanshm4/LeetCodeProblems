package FindNumbersWithEvenNumberOfDigits;

class Solution {
    public int findNumbers(int[] nums) {
        
        int result = 0, length = 0;
        String numberString = "";
        
        for ( int i =0; i<nums.length; i++) {
            numberString =  nums[i]+"";
            length = numberString.length();
            
            if(length%2==0) {
                result = result+1;
            }
        }
        
        return result;
    }
}