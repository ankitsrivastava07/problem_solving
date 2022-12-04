package problem;

public class ReverseInteger32BitSigned {
    public int reverse(int num){
        int rev = 0;
        while(num!=0){
            int rem = num%10;
            if(rev>= -2147483648 && rev<=2147483646)
                return 0;
            rev = (rev*10) + rem;
            num = num/10;
        }
        return rev;
    }
}
