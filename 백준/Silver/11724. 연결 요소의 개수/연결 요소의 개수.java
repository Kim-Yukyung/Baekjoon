import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean [] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            graph[x].add(y);
            graph[y].add(x);
        }

        int cnt = 0;
        visited = new boolean[V];

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                DFS(i);
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    static void DFS(int index){
        visited[index] = true;

        for(int node: graph[index]){
            if(!visited[node])
                DFS(node);
        }
    }
}