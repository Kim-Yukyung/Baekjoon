import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String [] temp = bf.readLine().split(" ");
        int s = Integer.parseInt(temp[0]);
        int p = Integer.parseInt(temp[1]);

        String str = bf.readLine();

        temp = bf.readLine().split(" ");
        int [] ACGT = new int [4];
        for(int i = 0; i < ACGT.length; i++){
            ACGT[i] = Integer.parseInt(temp[i]);
        }

        int cnt = 0, startIdx = 0, endIdx = p - 1;

        for (int i = 0; i < p; i++) {
            int charIdx = "ACGT".indexOf(str.charAt(startIdx + i));

            if(charIdx != -1)
                ACGT[charIdx]--;
        }

        if (ACGT[0] <= 0 && ACGT[1] <= 0 && ACGT[2] <= 0 && ACGT[3] <= 0)
            cnt++;

        startIdx++; endIdx++;

        while(endIdx < s){
            int addIdx = "ACGT".indexOf(str.charAt(endIdx));
            int removeIdx = "ACGT".indexOf(str.charAt(startIdx - 1));

            if(addIdx != -1)
                ACGT[addIdx]--;
            if(removeIdx != -1)
                ACGT[removeIdx]++;

            if (ACGT[0] <= 0 && ACGT[1] <= 0 && ACGT[2] <= 0 && ACGT[3] <= 0)
                cnt++;

            startIdx++; endIdx++;
        }

        System.out.println(cnt);
    }
}