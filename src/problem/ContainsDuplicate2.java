package problem;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<String, String> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) if (Math.abs(nums[i] - i) <= k) return true;
        }
        return false;
    }
}
