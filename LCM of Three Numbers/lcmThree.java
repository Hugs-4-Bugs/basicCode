public class lcmThree {

    public static int lcm(int a ,int b) {
        int temp = a;
        while (true) {
            if (temp % b == 0 && temp % a == 0)
                break;
            temp++;
        }
        return temp;
    }
    public static void main(String[] args){
        int a=22,b=21,c=30,l=0,k=0;
        if(a>b)
            l=lcm(b,a);
        else
            l=lcm(a,b);
        if(l>c)
            k=lcm(c,l);
        else
            k=lcm(l,c);
        System.out.println(k);
    }
}
