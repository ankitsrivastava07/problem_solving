package problem;
import java.util.LinkedHashMap;
import java.util.Map;
public class ReaptedCharacter {

    public char firstRep(String str)
    {
        char chs[] = str.toCharArray();
           char result = (char) -1;
        LinkedHashMap<Character,Integer> uniqueChs= new LinkedHashMap();
        for(char ch : chs){
            if(uniqueChs.containsKey(ch)) {
                uniqueChs.put(ch, uniqueChs.get(ch) + 1);
            }
            else
           uniqueChs.put(ch,1);
        }

        for (Map.Entry<Character,Integer> entry : uniqueChs.entrySet()){
            if(entry.getValue()>1){
                return entry.getKey();
            }
        }
        return '#';
    }
}
