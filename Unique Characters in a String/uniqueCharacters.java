import java.util.*;
import java.io.*;

public class UniqueCharacters {

    public static String uniqueCharacters(String str) {
        String s ="";
            s=s+str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                s=s+str.charAt(i);
                for (int j = s.length()-2;j>=0;j--){
                    if(str.charAt(i)==s.charAt(j))
                        s=s.substring(0,s.length()-1);
                }
            }
        return s;
    }
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=scan.nextLine();
        System.out.println(uniqueCharacters(s));
    }
}
