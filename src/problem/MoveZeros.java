package problem;

public class MoveZeros {
    public void movezeros(int nums[]){
        int nonZero = 0, ind = 0;
        int indx = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!= 0) {
                nums[ind++] = nums[i];
                nonZero = nonZero + 1;
            }
        }

        for(int i=0; i< nums.length-nonZero; i++){
            nums[indx--] =0;
        }
    }
}
