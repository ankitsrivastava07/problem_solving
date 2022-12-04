package problem;

import java.util.*;

public class RemoveDuplicateFromLinkedList<T> {

    class Node<T> {
        private T val;
        private Node<T> next;

        Node(T val) {
            this.val = val;
        }
    }

    Node<T> curr, head;

    public T add(T val) {
        Node<T> node = new Node<>(val);
        if (Objects.isNull(head)) {
            head = node;
            curr = node;
        } else {
            curr.next = node;
            curr = node;
        }
        return curr.val;
    }

    public void removeDuplicate() {
        Set count = new HashSet<>();
        Node curr = head, prev = null;
        while (curr != null) {
            if (count.contains(curr.val)) {
                prev.next = curr.next;
                curr = prev.next;
                continue;
            }
            prev = curr;
            count.add(curr.val);
            curr = prev.next;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }
}
