import java.util.*;
public class lcmRecursion {
    static int gcd(int a, int b){
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int result=lcm(a,b);
        System.out.println(result);
    }
}
