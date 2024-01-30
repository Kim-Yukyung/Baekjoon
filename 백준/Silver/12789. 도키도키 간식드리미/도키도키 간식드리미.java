import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        String [] temp = bf.readLine().split(" ");

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < temp.length; i++){
            queue.add(Integer.parseInt(temp[i]));
        }

        int chance = 1;

        while(!queue.isEmpty()){
            if(chance == queue.peek()){
                queue.poll();
                chance++;
            } else if(!stack.isEmpty() && chance == stack.peek()){
                stack.pop();
                chance++;
            } else if(chance != queue.peek()){
                stack.push(queue.poll());
            }
        }

        while(!stack.isEmpty()){
            if(chance == stack.peek()){
                stack.pop();
                chance++;
            } else {
                System.out.print("Sad");
                return;
            }
        }
        
        System.out.print("Nice");
    }
}