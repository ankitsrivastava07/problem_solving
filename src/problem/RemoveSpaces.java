package problem;

public class RemoveSpaces {
    public String removeSpace(String S){
        char chs[] = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : chs){
            if(ch!=' ')
                sb.append(ch);
        }
        return sb.toString();
    }
}
