import java.util.*;

public class SolutionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // initialize with an invalid index

        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i); // update with the latest invalid index
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        System.out.println(maxLength);
    }
}
