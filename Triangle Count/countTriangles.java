import java.util.Arrays;

public class triangleCount {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 5, 7, 6};
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < n; ++j) {
                while (k < n && arr[i] + arr[j] > arr[k])
                    ++k;
                if (k > j)
                    count += k - j - 1;
            }
        }
        System.out.println(count);
    }
}
