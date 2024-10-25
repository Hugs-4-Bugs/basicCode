import java.util.*;

public class ShortestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // Reverse the original string
        String reversed = new StringBuilder(s).reverse().toString();

        // Find the longest palindrome that starts from the beginning of the reversed string
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.substring(0, n - i).equals(reversed.substring(i))) {
                System.out.println(reversed.substring(0, i) + s);
                break;
            }
        }
    }
}
