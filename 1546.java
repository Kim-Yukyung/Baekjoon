import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        String [] str = bf.readLine().split(" ");

        double [] score = new double [size];
        double max = 0;

        for(int i = 0; i < score.length; i++){
            score[i] = Double.parseDouble(str[i]);
            max = Math.max(max, score[i]);
        }

        double result = 0;

        for(int i = 0; i < score.length; i++){
            score[i] = (score[i] / max * 100);
            result += score[i];
        }

        System.out.println(result/score.length);
    }
}
