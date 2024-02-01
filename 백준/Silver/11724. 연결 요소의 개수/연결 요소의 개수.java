import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String [] temp = bf.readLine().split(" ");
        int V = Integer.parseInt(temp[0]);
        int E = Integer.parseInt(temp[1]);

        ArrayList<Integer>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            temp = bf.readLine().split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);

            graph[x - 1].add(y);
            graph[y - 1].add(x);
        }

        int index = 0;
        boolean [] visited = new boolean[V];

        boolean flag = true;
        int cnt = 0;

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] != true) {
                index = i;
                flag = false;
                break;
            }
        }

        while(flag != true) {
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] != true) {
                    index = i;
                    flag = false;
                    break;
                }
                else flag = true;
            }

            if(flag == false) {
                DFS(V, index, graph, visited);
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    static void DFS(int V, int index, ArrayList<Integer>[] graph, boolean [] visited){
        visited[index] = true;

        for(int node: graph[index]){
            if(!visited[node-1])
                DFS(V, node-1, graph, visited);
        }
    }
}