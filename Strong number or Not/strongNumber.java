import java.util.Scanner;
public class strongNumber
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		int fac,sum = 0;
		int n = number;
		while(n != 0)
		{	
			fac = 1;
			int r = n % 10;
      
			for(int i = r ; i >= 1 ; i--)
			fac = fac * i;
      
			sum = sum + fac;
			n=n/10;
		}

		if(sum == number)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");												
	}
}
