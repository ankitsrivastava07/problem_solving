package problem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class ReverseVowelOfString {
    public static String reverseVowelsOfString(String s) {
        char chs[] = s.toCharArray();
        char vowels [] = new char[chs.length];
        int ind = 0;
        Set<Character> vowelLetters = new HashSet<>();
        vowelLetters.add('a');
        vowelLetters.add('A');
        vowelLetters.add('e');
        vowelLetters.add('E');
        vowelLetters.add('i');
        vowelLetters.add('I');
        vowelLetters.add('o');
        vowelLetters.add('O');
        vowelLetters.add('u');
        vowelLetters.add('U');

        for(char ch : chs){
            if(vowelLetters.contains(ch)){
                vowels[ind++] = ch;
            }
        }
        for(int i =0; i<chs.length; i++){
              char ch = chs[i];
            if(vowelLetters.contains(ch)) {
                 ind = ind -1;
                chs[i] = vowels[ind];
            }
        }
        return new String(chs);
    }
}
