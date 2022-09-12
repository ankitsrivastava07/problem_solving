package problem;
import java.util.HashSet;
import java.util.Set;
public class RemoveVowel {
    String removeVowelsFromString(String S) {
        char chs[] = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        for (char ch : chs) {
            if(!vowel.contains(ch))
                sb.append(ch);
        }
        return sb.toString();
    }
}
