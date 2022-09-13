package problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class SortLinkedList<T> {

    class Node<T> {
        T val;
        Node<T> next;

        Node(T val) {
            this.val = val;
        }
    }

    private Node<T> head, curr;

    public T add(T val) {
        return addNode(val);
    }

    private T addNode(T val) {
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

    public void sortList() {

        ArrayList<T> elmts = new ArrayList<>();
        Node<T> temp = head;

        while (temp != null) {
            elmts.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        elmts.sort(Comparator.comparingInt(e-> (int) e));
        for (T val : elmts) {
            temp.val = val;
            temp = temp.next;
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
