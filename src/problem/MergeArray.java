package problem;

import java.util.Arrays;

public class MergeArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int ind = (m + n) - 1;
        for (int i = 0; i < nums2.length; i++) {
            if (nums1.length > 0 && ind < nums1.length)
                nums1[ind--] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
