package problem;
public class RotateArray {
    public static void rotateArray(int arr[], int d, int n) {
        int cnt = 0;
        n = n - 1;
        while (cnt < d) {

            int temp = arr[0];
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n] = temp;
            cnt = cnt + 1;
        }

    }
}
