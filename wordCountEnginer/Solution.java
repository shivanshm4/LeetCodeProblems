package wordCountEnginer;

import java.io.*;
import java.util.*;

class Solution {

  static String[][] wordCountEngine(String document) {
    // your code goes here
    //StringBuilder word = new StringBuilder();
    String word ="";
    HashMap<String, String> wordFreq = new HashMap<>();
    document = document.toLowerCase();
    for(int i = 0; i<document.length(); i++){
      if(document.charAt(i)>97 && document.charAt(i) < 122 || document.charAt(i) >47 && document.charAt(i)<=57) {
        word += document.charAt(i);
      }
      if(wordFreq.containsKey(word)) {
        wordFreq.put(word, ""+Integer.parseInt(wordFreq.get(word))+1);
        word ="";
      } else {
        wordFreq.put(word, "1");
        word = "";
      }
    }
    
    String[][] wordCountEngine = new String[wordFreq.size()][2];
    int i=0;
    for(String e: wordFreq.keySet()){
      wordCountEngine[i][0] = e;
      wordCountEngine[i][1] = wordFreq.get(e);
      i++;
     }
    return wordCountEngine;
  }

  public static void main(String[] args) {
    String document = "Practice makes perfect. you'll only get Perfect by practice. just practice!";

    String[][] wordCount = wordCountEngine(document);
    for(int i = 0; i<wordCount.length; i++){
      for(int j = 0; j<2; j++) {
        System.out.println(wordCount[i][0] +"   " + wordCount[i][1]);
      }
    }
  }

}