package problem;

public class ValidPalindrome {
    public boolean isPalindrome(String s){

        char chs [] = s.toLowerCase().toCharArray();

        String nonAlphaCh = "";

        for(char ch : chs){
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<= 57)){
                nonAlphaCh = nonAlphaCh + ch;
            }
        }
        StringBuilder sb = new StringBuilder(nonAlphaCh);
        String revWord = sb.reverse().toString();

        return revWord.equals(nonAlphaCh) ? true : false;
    }
}
