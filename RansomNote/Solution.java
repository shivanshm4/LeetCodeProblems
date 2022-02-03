package RansomNote;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
        
        HashMap<String, Integer> magazineWords = new HashMap<String, Integer>();
        
        for(String word: magazine) {
            if (magazineWords.containsKey(word)){
                magazineWords.put(word, magazineWords.get(word) + 1);
            } else {
                magazineWords.put(word, 1);
            }
        }
        for(String word: note) {
            if (magazineWords.containsKey(word)  && magazineWords.get(word)>0){
                magazineWords.put(word, magazineWords.get(word) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");        

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
