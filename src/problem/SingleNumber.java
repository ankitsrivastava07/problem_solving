package problem;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> numsCnt = new HashMap<>();
        for(Integer num: nums){

            numsCnt.put(num, numsCnt.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry: numsCnt.entrySet()){
            if(entry.getValue() == 1)
                return entry.getValue();
        }
        return 0;
    }
}
