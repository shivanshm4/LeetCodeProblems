package strStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(haystack)){
            return 0;
        }
        if( needle.length() > haystack.length()) {
            return -1;
        }
        if("".equals(needle)){
            return 0;
        }
        int j = 0, k=0;
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        for(int i = 0; i<haystackLen;  i++) {
            if(haystack.charAt(i) == needle.charAt(0)){

                if( needleLen > haystackLen-i ) {
                    return -1;
                }
                for(j = 1, k=i+1; j<needleLen; j++, k++){
                    if(haystack.charAt(k) != needle.charAt(j)){
                        break;
                    } 
                }

                if(j == needleLen){
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        Solution obj = new Solution();
        System.out.println(obj.strStr("mississippi", "sippia"));
    }
}
