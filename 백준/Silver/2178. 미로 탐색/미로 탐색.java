import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static boolean [][] visited;
    static int [][] matrix;

    static int [] dx = {0, 1, 0, -1};
    static int [] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        matrix = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            String temp = bf.readLine();
            for(int j = 0; j < M; j++){
                matrix[i][j] = temp.charAt(j) - '0';
            }
        }

        BFS();
        System.out.print(matrix[N-1][M-1]);
    }

    static void BFS() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for(int k = 0; k < 4; k++){
                int x = point.x + dx[k];
                int y = point.y + dy[k];

                if(x >= 0 && y >= 0 && x < matrix.length && y < matrix[0].length){
                    if(matrix[x][y] != 0 && !visited[x][y]){
                        visited[x][y] = true;
                        matrix[x][y] = matrix[point.x][point.y] + 1;
                        queue.add(new Point(x, y));
                    }
                }
            }
        }
    }

}