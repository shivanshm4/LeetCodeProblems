package MedianOfTwoSortedArray;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int finalSize = nums1.length + nums2.length;
        int[] finalArr = new int[finalSize];
        int iterations = 0;
        int medianOdd  = 0;
        int evenNum1 = 0, evenNum2 = 0;
        if(finalSize%2 == 0){
            iterations = finalSize/2;
            int i = 0, j = 0, k=0;
            while(i< nums1.length && j<nums2.length && k<= iterations){
                if(nums1[i]<nums2[j]) {
                    finalArr[k] = nums1[i];
                    i++;
                } else {
                    finalArr[k] = nums2[j];
                    j++;
                }
                if(k == iterations-1){
                    evenNum1 = finalArr[k];
                }
                k++;
            }
            while(i< nums1.length && k<= iterations) {
                finalArr[k] = nums1[i];
                i++;
                if(k == iterations-1){
                    evenNum1 = finalArr[k];
                }
                k++;
            }
            while(j< nums2.length && k<= iterations) {
                finalArr[k] = nums2[j];
                j++;
                if(k == iterations-1){
                    evenNum1 = finalArr[k];
                }
                k++;
            }
            
            evenNum2 = finalArr[iterations];
            if((evenNum1+evenNum2) % 2 == 0) {
                return (evenNum1+evenNum2)/2;
            } else {
                return (evenNum1+evenNum2)/2 + 0.5;
            }
            
        } else {
            iterations = finalSize/2 ;
            int i = 0, j = 0, k = 0;
            while(i< nums1.length && j<nums2.length && k<= iterations){
                if(nums1[i]<nums2[j]) {
                    finalArr[k] = nums1[i];
                    i++;
                } else {
                    finalArr[k] = nums2[j];
                    j++;
                }
                if(k == iterations){
                    return finalArr[k];
                }
                k++;
            }
            while(i< nums1.length && k<= iterations) {
                finalArr[k] = nums1[i];
                i++;
                if(k == iterations){
                    return finalArr[k];
                }
                k++;
            }
            while(j< nums2.length && k<= iterations) {
                finalArr[k] = nums2[j];
                j++;
                if(k == iterations){
                    return finalArr[k];
                }
                k++;
            }
            
            evenNum2 = finalArr[k];
            return (evenNum1+evenNum2)/2;
        }
        
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println(new Solution().findMedianSortedArrays(arr1, arr2));

    }
}