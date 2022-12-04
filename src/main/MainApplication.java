package main;
import problem.MergeArray;
import java.util.Arrays;

public class MainApplication {

    public static void main(String args[]) {
        int nums1[] = {1,2,3,0,0,0};

         int nums2[] = {2,5,6};
        MergeArray mergeArray = new MergeArray();
        int mergeArr[]= mergeArray.merge(nums1,3,nums2,3);

        System.out.println(Arrays.toString(mergeArr));
    }
}
