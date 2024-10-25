public class reverseStringWithout {

    public static String reverseString(char[] str,int start ,int end){
        while(start < end){
            str[start]^= str[end];
            str[end]^=str[start];
            str[start]^=str[end];
            ++start;
            --end;
        }

        return String.valueOf(str);
    }

public static void main(String[] args){
    String s="abcdefghijklmnopqrstuvwxyz";
    System.out.println(reverseString(s.toCharArray(),0,s.length()-1));
}
}
