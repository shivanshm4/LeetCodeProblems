package RemoveDuplicateLetters;

import java.util.HashSet;

public class Solution {

    HashSet<Character> uniqueChars = new HashSet<>();
    public String removeDuplicateLetters(String s) {
        for(int i = 0; i<s.length(); i++){
            uniqueChars.add(s.charAt(i));
        }
        
        return findSubsequence("", s, 0);
    }

    public String findSubsequence(String subsequence,String s, int index){
        
        if(subsequence.length()  == uniqueChars.size()){
            return subsequence;
        }
        
        if(index == s.length()){
            return subsequence;
        }
        String minSubsequence = "";
        for(int i = index; i<s.length(); i++){
            if(subsequence.indexOf(s.charAt(i))<0){
                subsequence += s.charAt(i);
                subsequence = findSubsequence(subsequence, s, index+1);
                if(minSubsequence.compareTo(subsequence) < 0){
                    minSubsequence = subsequence;
                    
                }
                
            } else{
                continue;
        }
    } 
        return minSubsequence;
    }

    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(new Solution().removeDuplicateLetters(s));
    }
}
