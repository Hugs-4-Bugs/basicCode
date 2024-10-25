import java.util.*;
public class FibonacciUsingRecursion {
    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the range till you want the series:");
        long n=scan.nextLong();
        System.out.print(fib(n));

    }
}
