package problem;

import java.util.HashMap;
public class MissingAndRepeatingNum {

    int[] findTwoElement(int arr[], int n) {
        HashMap<Integer, Integer> numberCount = new HashMap<>();

        int ind = 0, cnt = 1, key = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int frq;
            numberCount.put(val, (frq = (numberCount.getOrDefault(val, 0) + 1)));
            if (frq == 2) {
                key = val;
            }
            ind = ind + 1;
        }
        while (cnt < n) {
            if (!numberCount.containsKey(cnt)) {
                return new int[]{key, cnt};
            }
            cnt = cnt + 1;
        }
        return new int[2];
    }
}
