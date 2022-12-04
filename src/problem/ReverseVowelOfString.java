package problem;

import java.util.Stack;

public class ReverseVowelOfString {
    public static String reverseVowelsOfString(String s) {
        char chs[] = s.toCharArray();
        Stack<Character> vowel = new Stack<>();
        for (char ch : chs)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vowel.push(ch);

        for (int i = 0; i < chs.length; i++) {
            char ch = chs[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                chs[i] = vowel.pop();
        }
        return new String(chs);
    }
}
