public class prefixSuffix {

    public static String countString(String str){
        String s1=str.substring(0,str.length()/2);
        String s2=str.substring(str.length()/2, str.length());
        String s="";
        int ptr=0;

            for(int j=0;j<s2.length();j++) {
                if (s1.charAt(ptr) == s2.charAt(j)) {
                    s =s + s1.charAt(ptr);
                    ptr++;
                }
                else{
                    s="";
                    ptr=0;
                    }
            }
    if(s!="")
        return s;
    else
        return "not found";
            }


public static void main(String[] args){
    String str="abab";
    System.out.println(countString(str));
}
}
