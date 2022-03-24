package isSubsequence;

import java.util.HashMap;

class Solution {
    HashMap<String, Boolean> memo = new HashMap<>();
    public boolean isSubsequence(String s, String t) {
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        if(s.length() > t.length()){
            return false;
        }
        if("".equals(s)){
            return true;
        }
        boolean isSubsequence = false;
        int startSearchIndex = 0;
        for(int i = 0; i<t.length(); i++) {
            if (t.charAt(i) == s.charAt(startSearchIndex)) {
                String newTarget = t.substring(i + 1);
                if (isSubsequence(s.substring(startSearchIndex + 1), newTarget)) {
                    isSubsequence = true;
                }
            }
        }
        memo.put(s, isSubsequence);
        return isSubsequence;
    }

    public static void main(String[] args) {
        String s = "bcd";
        String t = "accbcdh";
        System.out.print(new Solution().isSubsequence(s, t));
    }
}