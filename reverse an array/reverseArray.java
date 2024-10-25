public class reverseArray { 

	/* function that reverses array and stores it 
	in another array*/
	static void reverse(int a[], int n) 
	{ 
		int[] b = new int[n]; 
		int i = 0; 
		for (int j = n-1; j>=0; j--,i++) { 
			b[j] = a[i]; 
			//j = j - 1; 
		} 

		/*printing the reversed array*/
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(b[k]); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr, arr.length); 
	} 
} 
