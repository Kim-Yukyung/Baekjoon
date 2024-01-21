import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int [] sumArr = new int [num + 1];

        for(int i = 1; i < sumArr.length; i++){
            sumArr[i] = sumArr[i - 1] + i;
        }

        int start = 1, end = 1, cnt = 0;

        while(end <= num){
            if(sumArr[end] - sumArr[start-1] == num){
                cnt++;
                end++;
            }
            else if(sumArr[end] - sumArr[start - 1] < num)
                end++;
            else if(sumArr[end] - sumArr[start - 1] > num)
                start++;
        }

        System.out.println(cnt);
    }
}