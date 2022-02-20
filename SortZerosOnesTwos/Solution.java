package SortZerosOnesTwos;

public class Solution {
    public static void sort012(int a[], int n)
    {
        // code here 
        int[] count = new int[3];
        
        for(int i = 0; i<n; i++){
            if(a[i] == 0){
                count[0]+=1;
            }
            if(a[i] == 1){
                count[1]+=1;
            }
            if(a[i] == 2){
                count[2]+=1;
            }
        }
        System.out.println(a[2]);
        int i = 0;
        int zeroCount = count[0];
        int oneCount = count[1];
        int twoCount = count[2];
        while(i<zeroCount){
            a[i] = 0;
            i++;
        }
        while(i < oneCount+i){
            a[i] = 1;
            i++;
        }
        while(i < twoCount+i){
            a[i] = 2;
            i++;
        }
        
    }

    public static void main(String[] args) {
        int[] a = {0,2,1 ,2, 0};
        sort012(a, 5);
        System.out.println(a);
    }
}
