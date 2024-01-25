import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        int pushed = 1;
        boolean flag = true;
        StringBuilder result = new StringBuilder();

        loop: for(int i = 0; i < size; i++) {
            int num = Integer.parseInt(bf.readLine());

            while (num < stack.peek()) {
                stack.pop();
                result.append("-\n");
            }

            while (num > stack.peek()) {
                if (pushed > size) {
                    flag = false;
                    break loop;
                }
                stack.push(pushed++);
                result.append("+\n");
            }

            if(stack.size() <= 1){
                flag = false;
                break loop;
            }

            stack.pop();
            result.append("-\n");
        }

        System.out.println(flag ? result : "NO");
    }
}