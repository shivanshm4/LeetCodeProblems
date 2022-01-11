class Solution {
    public static int removeDuplicates(int[] nums) {
        
       int tempIndex = 0;
        for ( int i = 0; i<nums.length;i++){
            if( i==0 || nums[i]!=nums[i-1]) {
                
                nums[tempIndex] = nums[i];
                tempIndex++;
            }
            
        }
        
        return tempIndex+1;
    }

    public static void main(String args[]) {


        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
    }
}