import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        boolean [][] room = new boolean[num + 1][num + 1];

        for(int i = 0; i < num; i++){
            String str = bf.readLine();
            for(int j = 0; j < num; j++){
                if(str.charAt(j) == '.')
                    room[i][j] = true;
            }
        }

        int resultRow = 0, resultColumn = 0;

        for(int i = 0; i < room.length; i++){
            int emptyRow = 0, emptyColumn = 0;
            for(int j = 0; j < room[i].length; j++){
                if(room[i][j] == true){
                    emptyRow++;
                }
                else {
                    if(emptyRow >= 2)
                        resultRow++;
                    emptyRow = 0;
                }

                if(room[j][i] == true){
                    emptyColumn++;
                }
                else {
                    if(emptyColumn >= 2)
                        resultColumn++;
                    emptyColumn = 0;
                }
            }
        }

        System.out.println(resultRow + " " + resultColumn);
    }
}
