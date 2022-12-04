package problem;

public class SumOfNumbersInString {
    public static int sumOfNumbersInString(String str) {
        char chs[] = str.toCharArray();
        String nums = "0";
        int sum = 0;
        for (int i = 0; i < chs.length; i++) {

            if (!(chs[i] >= 48 && chs[i] <= 57)) {
                sum = sum + Integer.parseInt(nums);
                nums = "0";
                continue;
            }
            nums = nums + (chs[i] - '0');
        }
        return sum + Integer.parseInt(nums);
    }
}
