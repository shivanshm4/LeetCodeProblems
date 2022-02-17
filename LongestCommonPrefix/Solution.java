package LongestCommonPrefix;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        
        int minLenString = Integer.MAX_VALUE;
        String smallestString = "";
        String longCommonPrefix = "";
        for(int i = 0; i<strs.length; i++){
            if(minLenString > strs[i].length()) {
                minLenString = strs[i].length();
                smallestString = strs[i];
            }
            
        }
        
        for(int i = 0; i<smallestString.length(); i++){
            for(int j=0; j<strs.length;  j++ ){
                if(strs[j].charAt(i) != smallestString.charAt(i)){
                    return longCommonPrefix;
                }
            }
            longCommonPrefix += smallestString.charAt(i);
        }
        return longCommonPrefix;
    }

    public static void main(String[] args) {
        
        Solution obj = new Solution();
        String[] strs = {"reflower","flow","flight"};
        System.out.println(obj.longestCommonPrefix(strs));
    }
}