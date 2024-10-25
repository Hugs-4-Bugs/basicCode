import java.util.Scanner;

public class LowerToUpper{
    public static void main(String args[]){
        Scanner scan= new Scanner((System.in));
        System.out.println("Enter the String 1:");
        String s1=scan.nextLine();
        System.out.println("Enter the String 2:");
        String s2=scan.nextLine();
        System.out.println(s1.concat(s2));

    }
}
