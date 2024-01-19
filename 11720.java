import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();

        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            sum += (str.charAt(i) - '0');
        }

        System.out.print(sum);
    }
}
