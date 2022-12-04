package problem;

public class RemoveNthNodeFromEndListOfList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head, currNode;

    public int add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            currNode = node;
        } else {
            currNode.next = node;
            currNode = node;
        }
        return currNode.val;
    }

    public Node removeNthFromEnd(int n) {

        Node temp = head, prev = head;
        int size = 0;

        if (temp.next == null)
            return null;

        while (temp != null) {
            size = size + 1;
            temp = temp.next;
        }

        int itr = 1;

        while (itr < size - n) {
            prev = prev.next;
            temp = prev.next;
            itr = itr + 1;
        }

        prev.next = prev.next.next;

        return head;
    }
}
