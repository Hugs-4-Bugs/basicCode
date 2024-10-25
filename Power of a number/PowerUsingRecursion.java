import java.util.Scanner;

public class PowerUsingRecursion {

    public static int power(int n, int p) {
        int result=0;
        if(p==0)
            result=1;
        else
            result= n*power(n,p-1);
    return result;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scan.nextInt();
        System.out.print("Enter the power:");
        int pow = scan.nextInt();
        int result = power(num, pow);
        System.out.println(result);
    }
}
