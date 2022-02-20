package DynamicProgramming.countConstruct;

import java.util.HashMap;

public class Solution {
    
    HashMap<String, Integer> memo = new HashMap<>();
    public int countConstruct(String word, String[] wordBank) {
        if(memo.containsKey(word)){
            return memo.get(word);
        }
        if("".equals(word)){
            return 1;
        }
        int res = 0;
        for(int i = 0; i < wordBank.length; i++) {
            if(word.indexOf(wordBank[i])==0){
                String newWord = word.substring(wordBank[i].length());
                res = res + countConstruct(newWord, wordBank);    
            }
        }
        memo.put(word, res);
        return res;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] wordBank = {"purp","p", "ur", "le", "purpl"};
        System.out.println(obj.countConstruct("purple", wordBank));
    }
}
