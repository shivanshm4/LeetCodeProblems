class Solution {

    public int[] sortedSquares(int[] nums) {
        int k = 0;
        int[] temp = new int[nums.length];
        for (k = 0; k<nums.length; k++) {
            if (nums[k]>=0) {
                break;
            }
        }
        
        int j = k-1;
        int i = k;
        int ind = 0;
        
        while (j>=0 && i<nums.length) {
            
            if (nums[i] * nums[i] < nums[j]*nums[j] ){
                temp[ind] = nums[i] * nums[i];
                i++;
            } else {
                temp[ind] = nums[j]*nums[j];
                j--;
            }
            ind++;
        }
        
        while (i<nums.length) {
            temp[ind] = nums[i] * nums[i];
            i++;
            ind++;
        }
        
        while (j>=0) {
            temp[ind] = nums[j]*nums[j];
            j--;
            ind++;
        }
        
        return temp;
        
    }
    
  
}