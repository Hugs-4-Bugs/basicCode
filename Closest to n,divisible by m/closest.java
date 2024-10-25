public class Closest {

    public static void closest(int n,int m){
        int quo=n/m;
        int n1=n*quo;
        int n2=n*m;
        if(n2>0)
            n2=m*(quo+1);
        else
            n2=m*(quo-1);
        if(Math.abs(n-n1)<Math.abs(n-n2))
            System.out.println(n1);
        else
            System.out.println(n2);
    }

    public static void main(String[] args){
        int n=-15;
        int m=6;
        closest(n,m);
    }
}
