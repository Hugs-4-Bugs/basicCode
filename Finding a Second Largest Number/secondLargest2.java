import java.util.Arrays;

public class secondLargest2{

    public static void secNum2(int[] arr){

        Arrays.sort(arr);
        System.out.println(arr[arr.length -2]);
    }

    public static void main(String[] args){
        int[] arr=new int[]{2,4,33,5,22,89};
        secondnum(arr);
        secNum2(arr);
    }
}
