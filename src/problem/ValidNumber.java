package problem;

public class ValidNumber {
    public boolean isNumber(String s) {
        double num = Double.parseDouble(s);
        return num>0 ? true : false;
    }
}
