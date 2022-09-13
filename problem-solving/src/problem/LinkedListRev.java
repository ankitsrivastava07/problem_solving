package problem;
import java.util.Objects;
public class LinkedListRev<T> {

    class Node<T>{
        private T val;
        private Node next;
      Node(T val){
          this.val = val;
      }
    }
    private Node<T> current, head;

    public T add(T val){
        Node<T> node = new Node<>(val);
       if (Objects.isNull(head)){
           head = node;
           current= node;
       }
       else{
           current.next = node;
           current = node;
       }
        return current.val;
    }

    public void reverse(){
        Node<T> temp, currNode = temp = head, prev = null;

        while (temp!=null){
            temp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = temp;
        }
        head = prev;
    }

    public void display(){
        Node<T> temp = head;

        while (temp!=null){
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }
}
