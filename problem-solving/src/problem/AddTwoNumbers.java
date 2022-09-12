package problem;

import java.io.Console;
import java.io.IOException;

public class AddTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        String num1 = "";
        String num2 = "";
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(temp1!=null || temp2!=null){
            if(temp1!=null)
                num1 = num1 + temp1.val;

            if(temp2!=null)
                num2 = num2 + temp2.val;

            if(temp1!=null)
                temp1 = temp1.next;

            if(temp2!=null)
                temp2 = temp2.next;
        }
        char sum[]  = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2)).toCharArray();
        ListNode currentNode = null, head = null;

        for (int i = sum.length-1; i>=0; i--){
            ListNode node = new ListNode(sum[i] - '0');
            if(head == null){
                head = node;
                currentNode = head;
            }
            else{
                currentNode.next = node;
                currentNode = node;
            }
        }
        return head;
    }
    public void display(ListNode head) {
        System.out.flush();
        while (head!=null){
            System.out.print(" " + head.val);
            head = head.next;
        }
        System.out.println();
    }
}
