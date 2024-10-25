public class JavaExample{  
   public static void main(String args[]){  
	String number = "10101";
	int bnum = Integer.parseInt(number, 2);         //binary to decimal
	String ostr = Integer.toOctalString(bnum);       //decimsl to octal
	System.out.println("Octal Value after conversion is: "+ostr);
   }
}
