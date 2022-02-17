package firstBadVersion;



public class Solution {
    public int firstBadVersion(int n) {
        
        if(n == 1){
            return 1;
        }
        int left = 1;
        int right = n;
        int firstBad = 0;
        while(left <= right) {
            int mid = left+((right-left)/2);
            System.out.println(mid);
            if(isBadVersion(mid)) {
                right = mid-1;
                System.out.println(mid);
                firstBad = mid;
                continue;
            }
            left = mid+1;
            System.out.println(left+"  "+right);
        }
        
        return firstBad;
    }

    boolean isBadVersion(int n){
        switch(n){
            case 1: return false;
            case 2: return false;
            case 3: return false;
            case 4: return true;
            case 5: return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstBadVersion(5));

    }
}
