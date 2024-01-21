import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        String [] str = bf.readLine().split(" ");

        int [] nArr = new int [n];

        for(int i = 0; i < str.length; i++){
            nArr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(nArr);

        int start = 0, end = n - 1, cnt = 0;

        while(start < end){
            if(nArr[start] + nArr[end] == m){
                cnt++;
                start++;
                end--;
            }
            else if(nArr[start] + nArr[end] < m)
                start++;
            else end--;
        }

        System.out.println(cnt);
    }
}