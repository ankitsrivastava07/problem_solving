package problem;

public class MainApplication {

    public static void main(String args[]) {
       int nums [] = {3,2,2,3};
       int removeElm = 3;
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElm(nums,removeElm));
    }
}
