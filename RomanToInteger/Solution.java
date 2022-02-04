package RomanToInteger;

public class Solution {

    public int romanToInt(String s) {
        
        int intValue = 0;
        char prevRomanChar = Character.MIN_VALUE;
        s=s.toUpperCase();
        for(int i = 0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            switch(ch) {
                case 'I': 
                    intValue += 1;
                    prevRomanChar = 'I';
                    break;
                case 'V':
                    if(prevRomanChar == 'I'){
                        intValue +=3;
                        break;
                    }
                    intValue+=5;
                    break;
                case 'X':
                    if(prevRomanChar == 'I'){
                        intValue +=8;
                        break;
                    }
                    prevRomanChar = 'X';
                    intValue+=10;
                    break;
                case 'L':
                    if(prevRomanChar == 'X'){
                        intValue+=30;
                        break;
                    }
                    intValue+=50;
                    break;
                
                case 'C':
                    if(prevRomanChar == 'X'){
                        intValue+=80;
                        break;
                    }
                    prevRomanChar = 'C';
                    intValue+=100;
                    break;
                case 'D':
                    if(prevRomanChar == 'C'){
                        intValue+=300;
                        break;
                    }
                    intValue+=500;
                    break;
                case 'M':
                    if(prevRomanChar == 'C'){
                        intValue+=800;
                        break;
                    }
                    intValue+=1000;
                    break;
            }
        }
        return intValue;
    }

    public static void main(String[] args) {
        Solution obSolution = new Solution();
        System.out.println(obSolution.romanToInt("DCXXI"));
    }
}
