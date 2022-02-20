package DynamicProgramming.canConstruct;

import java.util.HashMap;

public class Solution {

    static HashMap<String, Boolean> memo = new HashMap<String,Boolean>(); 
    static boolean canConstruct(String word, String[] wordBank){
        
        if(memo.containsKey(word)) {
            return memo.get(word);
        }
        if("".equals(word)) {
            return true;
        }

        for(int i = 0; i<wordBank.length; i++){
            if(word.indexOf(wordBank[i]) == 0){
                String newWord = word.substring(wordBank[i].length());
                if(canConstruct(newWord, wordBank)){
                    memo.put(word, true);
                    return true;
                }
            }
        }
        memo.put(word, false);
        return false;
        
    }


    public static void main(String[] args) {
        String[] wordBank = {"ac","bc", "abc", "cdd", "def"};
        System.out.println(canConstruct("acacacacacacacacacacacacacacacacacacacacacacacacacacacacacacacacacacac", wordBank));
    }
} 
