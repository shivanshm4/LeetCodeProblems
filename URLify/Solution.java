package URLify;


//This solution is using an In Place Algorithm 
public class Solution {

    private String urlifyString(String s, int len){

        char[] charArr = s.toCharArray();
        for(int i = 0; i<charArr.length; i++){
            System.out.print(charArr[i]);
        }
        len -=1;
        int last = charArr.length - 1;
        while(len >= 0){
            if(charArr[len] != ' '){
                charArr[last] = charArr[len];
                charArr[len] = ' ';
                last--;
                len--;
            } else {
                charArr[last] = '0';
                charArr[last-1] = '2';
                charArr[last-2] = '%';
                len -= 1;
                last -=3;  
            }
        }
        StringBuilder urlString = new StringBuilder();
        for(int i = 0; i<charArr.length; i++){
            urlString.append(charArr[i]);
        }
        return urlString.toString().trim();
    }
    public static void main(String[] args) {
        String s = "Mr John Smith        ";
        Solution obj = new Solution();
        System.out.println(obj.urlifyString(s, 13));
    }
}


