import java.util.Arrays;

public class printX {

    public static void main(String[] args) {
        int n = 5;
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++)
                    a[i][j] = '*';
            } else {
                a[i][0] = '*';
                a[i][n - 1] = '*';
                for (int m=1;m<n-1;m++)
                    a[i][m]= ' ';
            }
        }
        for (int l = 0; l < n; l++) {
            for (int k = 0; k < n; k++) {
                System.out.print(a[l][k]);
            }
            System.out.println();
        }
    }
}
