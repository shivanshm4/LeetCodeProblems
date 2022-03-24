package ReverseWordsInString;

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here
        if(S.length() == 0){
            return "";
        } else{
            String word = "";
            int lastIndexDot = S.lastIndexOf(".");
            if(lastIndexDot < 0) {
                return S;
            } else {
                for(int i = lastIndexDot + 1; i<S.length(); i++){
                    word += S.charAt(i);
                }
                
                return word+"."+reverseWords(S.substring(0,lastIndexDot));
            }
        }
    }

    public static void main(String[] args) {
        String S = "I.like.this.program";
        Solution s = new Solution();
        System.out.println(s.reverseWords(S));
    }
    

}
