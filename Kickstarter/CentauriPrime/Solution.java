package Kickstarter.CentauriPrime;

import java.util.*;

class Solution {

  static List<Character> vowels;

  private static String getRuler(String kingdom) {
    String ruler = "";

    if(kingdom.charAt(kingdom.length()-1) == 'Y' || kingdom.charAt(kingdom.length()-1) == 'y') {
      ruler = "Nubody";
    } else {
      if (vowels.contains(kingdom.charAt(kingdom.length() - 1))) {
        ruler = "Alice";
      }
      if (!vowels.contains(kingdom.charAt(kingdom.length() - 1))) {
        ruler = "Bob";
      }
    }
    

    return ruler;
  }

  private static void fillVowels() {
    vowels = new ArrayList<>();
    char[] arr = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
    for (int i = 0; i < arr.length; i++) {
      vowels.add(arr[i]);
    }
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();
      fillVowels();
      for (int t = 1; t <= T; ++t) {
        String kingdom = in.next();
        System.out.println(
            "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
      }
    }
  }
}