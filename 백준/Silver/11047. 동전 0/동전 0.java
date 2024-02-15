import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [] coin = new int[N];
        for(int i = 0; i < coin.length; i++){
            coin[i] = Integer.parseInt(bf.readLine());
        }

        int result = 0;
        for(int i = coin.length - 1; i >= 0; i--){
            result += (K/coin[i]);
            K %= coin[i];

            if(K == 0)
                break;
        }

        System.out.print(result);
    }
}
