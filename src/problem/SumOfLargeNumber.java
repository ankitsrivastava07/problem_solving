package problem;
import java.math.BigInteger;
public class SumOfLargeNumber {

    public String sumOfLargeNo(String str1, String str2){
        BigInteger num1 = new BigInteger(str1);
        BigInteger num2 = new BigInteger(str2);
        return num1.add(num2).toString();
    }
}
