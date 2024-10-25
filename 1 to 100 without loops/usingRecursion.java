import java.util.Scanner;

public class usingRecursion{
    static int i=1;
    public static void main(String args[]){

       if(i<=100){
           System.out.println(i);
               i++;
            main(null);
       }
    }
}
