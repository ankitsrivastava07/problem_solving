package problem;
import java.util.HashSet;
import java.util.Set;

public class RemoveCommonCharacter {
    public String removeCommonCharacterAndConcat(String s1, String s2){

      Set<Character> uniqueCharacter = new HashSet<>();
          char chs[] = s1.toCharArray();
        for(char ch : chs){
            uniqueCharacter.add(ch);
        }

        return null;
    }
}
