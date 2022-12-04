package problem;

public class RunningSum1dArray {
    public int[] runningSum(int nums[]) {

        int sumOfArr[] = new int[nums.length];

        int sum = 0;
        int ind =0;
        for(int el : nums){
          sum = sum + el;
          sumOfArr[ind++] = sum;
        }
        return sumOfArr;
    }
}
