import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        String [] temp = bf.readLine().split(" ");

        int [] arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(bf.readLine());
        String [] keys = bf.readLine().split(" ");

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < keys.length; i++){
            result.append(binarySearch(arr, Integer.parseInt(keys[i]))).append("\n");
        }
        System.out.print(result);
    }

    static int binarySearch(int [] arr, int key){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(key == arr[mid])
                return 1;
            else {
                if (key < arr[mid])
                    right = mid - 1;
                else left = mid + 1;
            }
        }
        return 0;
    }
}