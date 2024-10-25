import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the range till you want the series:");
        long n=scan.nextLong();
        double result=(Math.pow((Math.sqrt(5)+1)/2,n))/(Math.sqrt(5));
        System.out.print((int)Math.floor(result));

    }
}
