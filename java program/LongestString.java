import java.util.Scanner;

public class LongestString {
    public static String StringChallenge(String sen) {
        String[] words = sen.split("\\W+"); // Split the string into words, ignoring punctuation
        
        String longestWord = "";
        for (String word : words) {
            // Remove any non-alphanumeric characters from the word
            String alphanumericWord = word.replaceAll("[^a-zA-Z0-9]", "");
            
            if (alphanumericWord.length() > longestWord.length()) {
                longestWord = alphanumericWord;
            }
        }
        
        return longestWord;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        System.out.println("Longest word: " + StringChallenge(input));
    }
}