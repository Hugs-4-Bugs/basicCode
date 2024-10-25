import java.util.*;
public class SumOfNumberUsingRecursion {
    public static int sumOfDigits(int num) {
        int result = 0;
        if (num == 0)
            return 0;
        else
            result = (num % 10) + sumOfDigits(num / 10);
        return result;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = scan.nextInt();
        int result = sumOfDigits(n);
        System.out.print(result);

    }
}
