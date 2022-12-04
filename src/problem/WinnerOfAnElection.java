package problem;

public class WinnerOfAnElection {

    public String winner(String str,int n){
           char chs[] = str.toCharArray();
           int ind =0;
           String lowerCase = "";
           for(char ch : chs){
               if(ch >= 65 && ch<=90){
                   ch = (char)(ch + 32);
                   chs[ind] = ch;
                   lowerCase = lowerCase + ch;
               }
               else
                   lowerCase = lowerCase + ch;
               ind++;
           }
        return lowerCase;
    }
}
