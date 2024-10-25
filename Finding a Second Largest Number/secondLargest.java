import java.util.Arrays;

public class secon {

    public static void secondnum(int[] arr){
        int max=arr[0],k=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                k=i;
            }
        }
        int secMax=arr[0];
        for(int j=0;j<arr.length;j++){
            if(arr[j]>secMax && j!=k)
                secMax=arr[j];
        }
        System.out.println(secMax);
    }
    public static void main(String[] args){
        int[] arr=new int[]{2,4,33,5,22,89};
        secondnum(arr);
        secNum2(arr);
    }
}
