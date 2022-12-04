package problem;
import java.util.HashMap;
import java.util.Map;
public class SecondRepeatedWord {
    public String secFrequent(String arr[]){

        Map<String,Integer> wordCount = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE, minFreq= Integer.MIN_VALUE;
        String secondRepWord = "";

        for(String word : arr){
            if(wordCount.containsKey(word)) {
                int val = wordCount.get(word) +  1;
                wordCount.put(word, val);
                maxFreq = maxFreq>=val ? maxFreq : val;
            }
            else
                wordCount.computeIfAbsent(word, key-> 1);
        }
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            int temp = entry.getValue();
            if(temp!=maxFreq && temp>minFreq){
                minFreq = temp;
                secondRepWord = entry.getKey();
            }
        }
        return secondRepWord;
    }
}
