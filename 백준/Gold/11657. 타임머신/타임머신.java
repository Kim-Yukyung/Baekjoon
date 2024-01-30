import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Edge{
    int in, out, cost;

    public Edge(int out, int in, int cost){
        this.in = in;
        this.out = out;
        this.cost = cost;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String [] temp = bf.readLine().split(" ");
        int city = Integer.parseInt(temp[0]);
        int bus = Integer.parseInt(temp[1]);

        ArrayList<Edge> graph = new ArrayList<>();

        for(int i = 0; i < bus; i++){
            temp = bf.readLine().split(" ");
            graph.add(new Edge(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2])));
        }

        bellmanFord(city, graph);
    }

    static void bellmanFord(int city, ArrayList<Edge> graph){
        long [] distance = new long[city + 1];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[1] = 0;

        for(int i = 0; i < city; i++){
            for(Edge edge : graph){
                if(distance[edge.out] != Long.MAX_VALUE && distance[edge.in] > distance[edge.out] + edge.cost){
                    distance[edge.in] = distance[edge.out] + edge.cost;
                }
            }
        }

        for(Edge edge : graph){
            if(distance[edge.in] != Long.MAX_VALUE && distance[edge.in] > distance[edge.out] + edge.cost) {
                System.out.print(-1);
                return;
            };
        }

        StringBuilder result = new StringBuilder();
        for(int i = 2; i < distance.length; i++){
            result.append((distance[i] == Long.MAX_VALUE) ? -1 : distance[i]).append("\n");
        }
        System.out.print(result);
    }
}