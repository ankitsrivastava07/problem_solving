package problem;

import java.util.HashMap;
import java.util.Map;

public class RemoveElementFromLinkedList<T> {

    class Node<T> {
        int val;
        Node<T> next;

        Node(int val) {
            this.val = val;
        }
    }

    Node<T> head, curr;

    public void add(int nums[]) {
        int ind =0;
        while (ind<nums.length) {
             int val = nums[ind];
            Node<T> node = new Node<>(val);
            if (head == null) {
                head = node;
                curr = head;
            } else {
                curr.next = node;
                curr = node;
            }
            ind = ind + 1;
        }
    }

    public void removeDuplicate(int val) {
        Node<T> temp = head, prev = null;


        String str = new String();
        while (temp != null) {
            str = str.concat("" + temp.val);
            temp = temp.next;
        }

        str = str.replace(val + "", "");
        int len = str.length();
        if (len == 0)
            return;
        temp = head;
        int cnt = 0;
        while (temp != null && cnt < len) {
            prev = temp;
            temp.val = Integer.valueOf("" + str.charAt(cnt));
            cnt = cnt + 1;
            temp = temp.next;
        }
        prev.next = null;
        //System.out.println("after remove " + str + "int val" + Integer.valueOf("" + '0'));
    }
    public void iterate() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print("," + temp.val);
            temp = temp.next;
        }
    }
}
