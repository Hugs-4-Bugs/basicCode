import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
            if(Math.sqrt(n)-Math.floor(Math.sqrt(n))==0)
                System.out.print("yes");
            else
                System.out.print("No");
    }
}
