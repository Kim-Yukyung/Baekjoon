import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String [] num = bf.readLine().split("");

        Arrays.sort(num);

        for(int i = num.length - 1; i >= 0; i--){
            System.out.print(num[i]);
        }
    }
}