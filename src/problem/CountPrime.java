package problem;

public class CountPrime {

    public static int countPrime(int n) {
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                cnt++;
        }
        return cnt;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
