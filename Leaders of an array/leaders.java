import java.util.Scanner;
//import java.util.*;

public class leaders {

    public static void printleaders(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int j;
            for (j = i + 1; j < arr.length; j++){
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == arr.length)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr=new int[]{16,19,4,3,8,3};
        printleaders(arr);
    }
}
