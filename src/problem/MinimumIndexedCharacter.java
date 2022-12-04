package problem;
import java.util.HashMap;
import java.util.Map;
public class MinimumIndexedCharacter {
    char chs2[] = {1};

    public int minIndexChar(String str, String patt) {
        char chs[] = str.toCharArray();
        char chs2[] = patt.toCharArray();

        Map<Character, Integer> characterCnt = new HashMap<>();
        int minInd = 0;
        for (int i = 0; i < chs.length; i++) {
            if (characterCnt.containsKey(chs[i])) {
                int ind = characterCnt.get(chs[i]);
                characterCnt.put(chs[i], ind);
                minInd = Math.min(i,ind);
            }
            else
                characterCnt.put(chs[i], i);
        }
        for (int i = 0; i < chs2.length; i++) {
            if (characterCnt.containsKey(chs2[i]))
                return characterCnt.get(chs2[i]);

        }
        return -1;
    }

    public int hashcode(int key){
        int Index = key & chs2.length-1;
      return Index;
    }
}
