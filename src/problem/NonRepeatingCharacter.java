package problem;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {

    public char nonrepeatingCharacter(String S){
      char chs [] = S.toCharArray();
        LinkedHashMap<Character,Integer> characterCount = new LinkedHashMap<>();
        for (char ch : chs){
            if(characterCount.containsKey(ch)){
                characterCount.put(ch, characterCount.get(ch) + 1);
            }
            else
            characterCount.put(ch,1);
        }
        for(Map.Entry<Character,Integer> entry : characterCount.entrySet()){
                if (entry.getValue() == 1)
                    return entry.getKey();
        }
        return '$';
    }
}
