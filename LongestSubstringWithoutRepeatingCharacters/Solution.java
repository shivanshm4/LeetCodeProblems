package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String substr = "";
        int maxLength = 0;
        if(s.length() == 1){
            return 1;
        }
        for (int i = 0; i < s.length(); i++) {

            
            if (map.containsKey(s.charAt(i))) {
                i = map.get(s.charAt(i))+1;
                map = new HashMap<Character, Integer>();
                substr = "";
            }
            map.put(s.charAt(i), i);
            substr = substr + s.charAt(i);
            maxLength = Math.max(maxLength, substr.length());
        }
        return maxLength;
    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        System.out.println(obj.lengthOfLongestSubstring("abcd"));
    }
}
