package DynamicProgramming.allConstruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    
    private List<List<String>> allConstruct(String word, String[] wordBank){

        if("".equals(word)){
            return new ArrayList<>();
        }

        List<List<String>> allWays =  new ArrayList<>();
        for(int i = 0; i<wordBank.length; i++){
            if(word.indexOf(wordBank[i])==0){
                 
                String suffix = word.substring(wordBank[i].length());
                List<List<String>> suffixWays = allConstruct(suffix, wordBank);
                if(suffixWays.size() == 0) {
                    suffixWays.add(new ArrayList<>(Arrays.asList(word)));
                } else {
                    for(List<String> way : suffixWays){
                        way.add(word);
                        allWays.add(way);
                    }
                }
            }
        }
        return allWays;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] wordBank = {"purp","p", "ur", "le", "purpl"};
        System.out.println(obj.allConstruct("purple", wordBank));
    }
}
