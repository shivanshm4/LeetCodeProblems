package atoi;

class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        int i = 0;
        int numberOfDigits = 0;
        char sign = Character.MIN_VALUE;
        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i);
            i++;
        }
        int j =i;
        System.out.println(s + " " + j);
        while(j<s.length()) {
            if (s.charAt(j)>=48 && s.charAt(j)<=57) {
                numberOfDigits += 1;
                j++;                
            }else{
                break;
            }
        }
        int number = 0;
        int placeValue = numberOfDigits;
        if(sign == '-') {
            while(i<=numberOfDigits) {
                switch(s.charAt(i)) {
                    
                    case '1': number = number+(int)Math.pow(10, --placeValue)*1;
                    break;
                    case '2':number = number+(int)Math.pow(10, --placeValue)*2;
                    break;
                    case '3':number = number+(int)Math.pow(10, --placeValue)*3;
                    break;
                    case '4':number = number+(int)Math.pow(10, --placeValue)*4;
                    break;
                    case '5':number = number+(int)Math.pow(10, --placeValue)*5;
                    break;
                    case '6':number = number+(int)Math.pow(10, --placeValue)*6;
                    break;
                    case '7':number = number+(int)Math.pow(10, --placeValue)*7;
                    break;
                    case '8':number = number+(int)Math.pow(10, --placeValue)*8;
                    break;
                    case '9':number = number+(int)Math.pow(10, --placeValue)*9;
                    break;
                    case '0':number = number+(int)Math.pow(10, --placeValue)*0;
                    break;
    
                }
                i++;
                if(number > Integer.MIN_VALUE) {
                    continue;
                } else {
                    number = Integer.MIN_VALUE;
                    break;
                }
            }
            number = -number;
        } else {
            while(i<numberOfDigits) {
                switch(s.charAt(i)) {
                    
                    case '1': number = number+(int)Math.pow(10, --placeValue)*1;
                    break;
                    case '2':number = number+(int)Math.pow(10, --placeValue)*2;
                    break;
                    case '3':number = number+(int)Math.pow(10, --placeValue)*3;
                    break;
                    case '4':number = number+(int)Math.pow(10, --placeValue)*4;
                    break;
                    case '5':number = number+(int)Math.pow(10, --placeValue)*5;
                    break;
                    case '6':number = number+(int)Math.pow(10, --placeValue)*6;
                    break;
                    case '7':number = number+(int)Math.pow(10, --placeValue)*7;
                    break;
                    case '8':number = number+(int)Math.pow(10, --placeValue)*8;
                    break;
                    case '9':number = number+(int)Math.pow(10, --placeValue)*9;
                    break;
                    case '0':number = number+(int)Math.pow(10, --placeValue)*0;
                    break;
    
                }
                i++;
                if(number < Integer.MAX_VALUE) {
                    continue;
                } else {
                    number = Integer.MAX_VALUE;
                    break;
                }
                
            }
        }
        
        
        return number;
        
    }

    public static void main(String[] args) {
        String s = "-91283472332";
        Solution obj = new Solution();
        int n = obj.myAtoi(s);
        System.out.println(n);
    }
}
