package problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
public class MedianOfTwoSortedArrays {

    public static double medianofTwoSortedArrays(int[] nums1, int[] nums2) {

        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < nums1.length; i++) {
            priorityQueue.add((double) nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            priorityQueue.add((double) nums2[i]);
        }
        java.util.List<Double> sortedElmts = new ArrayList<>();

        Iterator<Double> itr = priorityQueue.iterator();
        while (itr.hasNext()) {
            sortedElmts.add(priorityQueue.poll());
        }
        int mid = sortedElmts.size() / 2;
        if (sortedElmts.size() % 2 == 0) {
            return (double) (sortedElmts.get((mid - 1)) + sortedElmts.get(mid)) / 2;
        }

        return sortedElmts.get(mid);

    }
}
