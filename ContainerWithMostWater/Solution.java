package ContainerWithMostWater;

class Solution {
    public static int maxArea(int[] height) {
     //using Shifting two pointers Technique
        int max_area = Integer.MIN_VALUE;
        int i=0, j=height.length-1;
        while(i<j) {
            int length = Math.min(height[i], height[j]);
            int width = j-i; 
            max_area = Math.max(max_area, length*width);
            /*  
            Since the distance (j-i) needs to be maximised, we will move either I or J
            If the value of height[i] < height[j] then we will move i forward else j backward;
            cause we need to maintain the distance and find a bigger number 
            */
            if(height[i] < height[j]){
                i++;
            } else{
                j--;
            }
        }
        return max_area;
    }

    public static void main(String args[]){

        int height[] = {2,3,4,5,18,17,6};

        System.out.println(maxArea(height));
    }
}