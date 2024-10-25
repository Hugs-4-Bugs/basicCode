import java.util.*;
public class ReverseANumberUsingRecursion {
    static int rev=0,lastDigit=0;
    public static int reverseNumber(int num){
        int result=0;
        if(num==0)
            return 0;
        else{
            lastDigit=(num%10);
            rev =rev*10+lastDigit;
            reverseNumber(num/10);
        }
        return rev;
    }

    public static void main (String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the new number:");
        int n=scan.nextInt();
        int result=reverseNumber(n);
        System.out.print(result);
    }
}
