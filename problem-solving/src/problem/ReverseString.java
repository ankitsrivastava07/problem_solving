package problem;
import java.util.Arrays;
public class ReverseString {
    public static void reverseString(char chs[]){
        int front = 0,rear = chs.length - 1;

        while (front<rear){
            char temp = chs[front];
            chs[front] = chs[rear];
            chs[rear] = temp;
            front = front + 1;
            rear = rear -1;
        }

        System.out.println(Arrays.toString(chs));
    }
}
