package problem;

import java.util.Objects;

public class RotateLinkedListByKPlace<T> {

    class Node<T> {
        private int val;
        private Node<T> next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node<T> head, curr, prev;

    public int add(int val) {
        return createNode(val);
    }

    private int createNode(int val) {
        Node<T> node = new Node<>(val);
        if (Objects.isNull(head)) {
            head = node;
            curr = head;
        } else {
            curr.next = node;
            curr = node;
        }
        return curr.val;
    }

    public void rotateToRightPlace(int k) {
        Node<T> temp, prev = temp = head;
        int cnt = 0;
        if (head == null || head.next == null)
            return;

        while (cnt < k) {
            temp = head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            temp.next = head;
            head = temp;
            cnt = cnt + 1;
        }
    }

    public void iterate() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }
}
