
import java.util.Arrays;

public class Cumulative2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        System.out.println("Cumulative Sum: " + Arrays.toString(arr));
    }
}