package problem;

public class MainApplication {
    public static void main(String args[]) {
        int nums[] = {12,7, 5, 1 ,13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
        int n= 14;
        SortLinkedList obj = new SortLinkedList();
        obj.add(1);
        obj.add(2);
        obj.add(1);
        obj.iterate();
        System.out.println();
        obj.sortList();
        obj.iterate();
    }
}
