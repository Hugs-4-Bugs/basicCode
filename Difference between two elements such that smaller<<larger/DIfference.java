public class DIfference {
    public static void difference(int[] arr,int n){
        int max=0,index=0,min=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        for(int j=index;j>=0 ; j--){
            min=arr[index];
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.print(max-min);
    }
    public static void main(String[] args){
        int[] arr=new int[]{2, 3, 10, 6, 4, 8, 1};
        int n=arr.length;
        difference(arr,n);

    }
}
