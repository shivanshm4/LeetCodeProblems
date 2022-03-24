package SubsetOfString;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public void findSubsets(String up, String p){
        if(up.length() <= 0){
            System.out.println(p);
            return;
        }

        // we can choose the current first character or we can skip it

        findSubsets(up.substring(1), p+up.charAt(0));
        findSubsets(up.substring(1), p);
        
    }

    public List<String> findSubsetsList(String up, String p){
        if(up.length() <= 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // we can choose the current first character or we can skip it

        List<String> left = findSubsetsList(up.substring(1), p+up.charAt(0));
        List<String> right = findSubsetsList(up.substring(1), p);
        left.addAll(right);
        return left;
        
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        s.findSubsets("abc", "");
        System.out.println(s.findSubsetsList("abc", ""));
    }
}
