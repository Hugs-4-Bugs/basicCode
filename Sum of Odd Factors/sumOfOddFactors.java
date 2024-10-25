public class sumOfOddFactors {

    public static int sumOfOdd(int n){
        int sum=0;
        while(n%2==0)
            n=n/2;
        for(int i=3;i<Math.sqrt(n);i=i+2) {
            while (n % i == 0) {
                sum = sum + i;
                n = n / i;
            }
        }
        if(n>2){
            if(n%2==1)
                sum=sum+n;
        }
        return sum;
    }

public static void main(String[] args){
    int n=1092;
    System.out.print(sumOfOdd(n));
}
}
