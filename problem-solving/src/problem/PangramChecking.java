package problem;
import java.util.HashSet;
import java.util.Set;
public class PangramChecking {
    public boolean checkPangram(String str){
        Set<Character> alphabets = new HashSet<>();
        char chs[] = str.toCharArray();
        for (char ch : chs){
            if(ch>= 65 && ch <= 90){
                ch = (char)(ch + 32);
                alphabets.add(ch);
            }
            else if(ch >= 97 && ch<= 122){
                alphabets.add(ch);
            }
        }
        return alphabets.size() == 26 ? true : false;
    }
}
