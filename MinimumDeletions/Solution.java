package MinimumDeletions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

class Solution {

    public int minDeletions(String s) {
        HashSet<Integer> freqSet = new HashSet<>();
        HashMap<Character, Integer> charFreqMap = new HashMap<>();
        char tempArray[] = s.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        String newString = new String(tempArray);

        int minDel = 0;
        for(int i= 0; i <newString.length(); i++) {
            if(charFreqMap.containsKey(s.charAt(i))){
                charFreqMap.put(s.charAt(i), charFreqMap.get(s.charAt(i))+1);
            } else {
                charFreqMap.put(s.charAt(i), 1);
            }
        }
        
        for(Entry<Character, Integer> e: charFreqMap.entrySet()){
            if(freqSet.contains(e.getValue())){
                while(freqSet.contains(e.getValue())){
                    if((e.getValue()) == 1) {
                        e.setValue(0);
                        minDel++;
                        break;
                    }
                    e.setValue((e.getValue())-1);
                    minDel++;
                }
                freqSet.add((e.getValue()));
            } else {
                freqSet.add((e.getValue()));
            }
            
        }
        
        return minDel;
    }
    
    public static void main(String[] args) {
        String s = "ceabaacb";
        System.out.println(new Solution().minDeletions(s));
    }
  
}