package problem;

public class SearchInRotateArr {
    public int search(int[] nums, int target) {
        int front = 0, rear = 0, ind = 0, mid = (nums.length/2);

        if(nums[mid]>target)
            rear = mid;
        else{
            front = mid;
            rear = nums.length-1;
        }

        while(front<=rear){
            if(nums[front] == target){
                return front;
            }
            front = front + 1;
        }
        return -1;
    }
}
