import java.util.*;

public class UnixPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        Deque<String> stack = new ArrayDeque<>();
        String[] dirs = path.split("/");

        for (String dir : dirs) {
            if (dir.equals("") || dir.equals(".")) {
                continue;
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }

        StringBuilder sb = new StringBuilder("/");
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
            if (!stack.isEmpty()) {
                sb.append("/");
            }
        }

        System.out.println(sb.toString());
    }
}
