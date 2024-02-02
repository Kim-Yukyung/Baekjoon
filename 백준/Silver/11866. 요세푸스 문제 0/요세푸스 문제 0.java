import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        StringBuilder result = new StringBuilder();

        while(!queue.isEmpty()){
            for(int i = 0; i < K - 1; i++){
                queue.add(queue.poll());
            }
            result.append(queue.poll()+", ");
        }

        System.out.print("<"+result.substring(0, result.length()-2)+">");
    }
}