package problem;

import java.util.HashMap;
import java.util.Objects;

public class LoopDetechInLinkedList<T> {

    class Node<T> {
        T val;
        Node<T> next;

        Node(T val) {
            this.val = val;
        }
    }

    Node<T> head, curr;

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

    public boolean hasCycle(){
        HashMap<Integer, Integer> count = new HashMap<>();

        return false;
    }
}
