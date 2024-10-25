import java.util.Scanner;

public class CompressedString {
    public static String StringChallange(String str) {
        StringBuilder compressedString = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
            } else {
                compressedString.append(count).append(str.charAt(i-1));
                count = 1;
            }
        }
        compressedString.append(count).append(str.charAt(str.length()-1));
        
        return compressedString.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        
        String result = StringChallange(input);
        System.out.println("Output: " + result);
    }
}