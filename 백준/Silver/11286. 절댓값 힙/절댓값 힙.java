import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if(Math.abs(o1) != Math.abs(o2))
                return Math.abs(o1) - Math.abs(o2);
            else
                return o1 - o2;
        });

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int temp = Integer.parseInt(bf.readLine());

            if(temp == 0){
                if(queue.isEmpty())
                    result.append("0\n");
                else
                    result.append(queue.poll() + "\n");
            } else {
                queue.add(temp);
            }
        }

        System.out.println(result);
    }
}