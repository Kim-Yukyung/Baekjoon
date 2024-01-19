import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int size, iterate;

        String [] inputTokens = bf.readLine().split(" ");
        size = Integer.parseInt(inputTokens[0]);
        iterate = Integer.parseInt(inputTokens[1]);

        int [] sumArr = new int [size + 1];

        inputTokens = bf.readLine().split(" ");

        for(int i = 0; i < size; i++){
            sumArr[i + 1] = sumArr[i] + Integer.parseInt(inputTokens[i]);
        }

        for(int i = 0; i < iterate; i++){
            inputTokens = bf.readLine().split(" ");

            int start = Integer.parseInt(inputTokens[0]);
            int end = Integer.parseInt(inputTokens[1]);

            System.out.println(sumArr[end] - sumArr[start - 1]);
        }
    }
}
