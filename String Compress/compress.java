public class compress {

    public static void main(String[] args) {
        String s="";
        String s1="aaaaabbbccccccccdaa";
        int n=s1.length();
        char c=s1.charAt(0);
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(c==s1.charAt(i)){
                count++;
            }
            else{
                s+=c;
                if(count>1)
                    s+=count;
                c=s1.charAt(i);
                count=1;
            }
        }
        s+=c;
        if(count>1)
            s+=count;
        System.out.println(s); }
}

