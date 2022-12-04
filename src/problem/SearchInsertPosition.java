package problem;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int midInd = nums.length / 2;
        if(nums.length == 1 && target>= nums[0])
            return 1;

        else if(nums.length ==1 && nums[0]>=target)
            return 0;

        if (nums[midInd] > target) {
            for (int i = 0; i < midInd; i++) {
                if (nums[i] >= target) {
                    return i;
                }
            }
        } else {
            for (int i = midInd; i < nums.length; i++) {
                if (nums[i] >= target)
                    return i;
            }
        }
        return nums.length;
    }
}
