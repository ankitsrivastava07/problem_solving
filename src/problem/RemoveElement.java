package problem;

import java.util.Arrays;

public class RemoveElement {
    public int removeElm(int nums[], int val){
        int cnt = 0;
        int ind = 0;
        int length = nums.length;
        int expectedNums[] = new int[nums.length];
        for(int i =0; i<length; i++){
            if(val == nums[i])
                continue;
            cnt++;
            expectedNums[ind++] = nums[i];
        }
        System.out.println(Arrays.toString(expectedNums));
        nums = expectedNums;
        return length - cnt;
    }
}
