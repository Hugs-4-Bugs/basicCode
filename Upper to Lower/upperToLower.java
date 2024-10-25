import java.util.Scanner;

public class UpperToLower {
    public static void main(String args[]){
        Scanner scan= new Scanner((System.in));
        System.out.println("Enter the String in CAPITAL:");
        String s=scan.nextLine();
        System.out.println(s.toLowerCase());

    }
}
