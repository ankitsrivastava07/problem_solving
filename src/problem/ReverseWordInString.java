package problem;

public class ReverseWordInString {
    public static String reverseWordInString(String s) {
        String words[] = s.split(" ");
        String reverseWord = "";
        int length = words.length;
        int cnt = 0;

        for (String word : words) {
            //cnt = cnt + 1;
            words[cnt++] = new StringBuilder(word).reverse().toString();
            //reverseWord = reverseWord + (cnt < length ? rev + " " : rev);
        }
        reverseWord=String.join(" ", words);
        return reverseWord;
    }

}
