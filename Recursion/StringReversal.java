package Recursion;

class StringReversal{

  static String stringReverse(String s) {
      if( s.length() <= 1) {
        return s;
      }
      return s.charAt(s.length()-1)+ stringReverse(s.substring(0,s.length()-1));
    }
    public static void main(String[] args) {
      System.out.println(stringReverse("simple Engineer"));
    }

}
