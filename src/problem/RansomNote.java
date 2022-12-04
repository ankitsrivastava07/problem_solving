package problem;
import java.util.HashMap;
import java.util.Map;
public class RansomNote {
    public boolean canConstructRansomNote(String ransomNote, String magazine ){
        Map<Character,Integer> characterCountMagazine = new HashMap<>();
        Map<Character,Integer> characterCountRansomNote = new HashMap<>();

        for(char ch : magazine.toCharArray())
            characterCountMagazine.put(ch, characterCountMagazine.getOrDefault(ch,0) + 1);

        for(char ch : ransomNote.toCharArray())
            characterCountRansomNote.put(ch, characterCountRansomNote.getOrDefault(ch,0) + 1);

        for (char ch : characterCountRansomNote.keySet())
            if(characterCountRansomNote.get(ch)> characterCountMagazine.get(ch))
                return false;
        return true;
    }
}
