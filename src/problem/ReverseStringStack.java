package problem;
import java.util.Stack;
public class ReverseStringStack {
    public String reverse(String str) {
        char chs[] = str.toCharArray();
        String reverse = "";
        char [] stack = new char[chs.length];
        int top = -1;
        for (char ch : chs) {
            stack[++top] = ch;
        }
        while(top>=0){
            reverse = reverse + stack[top--];
        }
        return reverse;
    }
}
