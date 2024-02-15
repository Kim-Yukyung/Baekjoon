import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(bf.readLine(), "-");
        List<Integer> num = new ArrayList<>();

        while(st1.hasMoreTokens()){
            StringTokenizer st2 = new StringTokenizer(st1.nextToken(), "+");

            int sum = 0;
            while(st2.hasMoreTokens()){
                sum += Integer.parseInt(st2.nextToken());
            }
            num.add(sum);
        }

        int result = num.get(0);
        for(int i = 1; i < num.size(); i++){
            result -= num.get(i);
        }

        System.out.print(result);
    }
}
