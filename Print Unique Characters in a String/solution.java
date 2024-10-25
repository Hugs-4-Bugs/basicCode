public class solution {

    public static void main(String[] args) {
      String s="adbcadef";
      String str="";
      int ptr=0;
      while(ptr<s.length()){
          str=str+s.charAt(ptr);
          for(int i=str.length()-2;i>=0;i--){
              if(s.charAt(ptr)==str.charAt(i))
                  str=str.substring(0, str.length() - 1);
          }
          ptr++;
      }
      System.out.println(str);
    }
}
