class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int startIndex = text1.indexOf(text2.charAt(0));
        int index = startIndex;
        int counter = 1;
        while(counter<text2.length() && index<text1.length() ){
            
            if (text1.charAt(index) == text2.charAt(counter)){
                counter++;
            }
            index++;
        }
        
        if ( counter == text2.length()) {
            return text2.length();
        }
        else
            return 0;
        
    }


    public static void main(String args[]){
        Solution objSolution =  new Solution();
        int n = objSolution.longestCommonSubsequence("abcde", "ace");
        System.out.println(n);
    }
}