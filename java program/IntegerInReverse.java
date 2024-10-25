// import java.util.*;

// public class IntegerInReverse {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();

//         int reversed = 0;
//         while (n != 0) {
//             int digit = n % 10;
//             reversed = reversed * 10 + digit;
//             n /= 10;
//         }

//         System.out.println(reversed);
//     }
// }


import java.util.Scanner;

public class IntegerInReverse {
    public static void main(String[] args) {
        // public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int reversed = 0;
            while (n != 0) {
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }
            System.out.println(reversed);
    }
}