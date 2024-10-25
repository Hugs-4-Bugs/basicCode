import java.util.*;
public class Factorial {
    static int res=0;
    public static int factorial(int num){
        if(num<=1)
            return num;
        else{
            res=num*factorial(num-1);
        }
        return res;
    }


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int result=factorial(n);
        System.out.println(result);
    }
}
