package problem;

import java.util.Objects;

public class LinkedListPalindrome<T> {

    class Node<T> {
        private T val;
        private Node<T> next;

        Node(T val) {
            this.val = val;
        }
    }
    Node<T> currNode , head ;

    public T add(T val){
        Node<T> node = new Node<>(val);

        if(Objects.isNull(head)){
          head = node;
          currNode = head;
        }
        else {
            currNode.next = node;
            currNode = node;
        }
        return currNode.val;
    }

    public boolean isPalindrom(){
        Node<T> temp = head;
        StringBuilder numbers = new StringBuilder();
        while (temp!=null){
            numbers.append(temp.val);
            temp = temp.next;
        }
        Integer rev = Integer.valueOf(numbers.reverse().toString());
       return rev.equals(Integer.parseInt(numbers.toString()));
    }
}
