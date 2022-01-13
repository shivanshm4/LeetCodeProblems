package TypedOutString;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> charS = new Stack<Character>();
        Stack<Character> charT = new Stack<Character>();
        
        for ( int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '#' ) {
                if(charS.isEmpty()){
                    continue;
                }
                charS.pop();                
            } else {
                charS.push(s.charAt(i));
            }
        }
        
        for ( int i=0; i<t.length(); i++) {
            if(t.charAt(i) == '#') {
                if(charT.isEmpty()){
                    continue;
                }
                charT.pop();                
            } else {
                charT.push(t.charAt(i));
            }
        }
        String finalT ="";
        String finalS ="";
        for(Character i: charT) {
            finalT = i+ finalT;
        }
        for(Character i: charS) {
            finalS = i+ finalS;
        }
        
        return finalT.equals(finalS);
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.backspaceCompare("y#fo##f","y#f#o##f"));
    }
}