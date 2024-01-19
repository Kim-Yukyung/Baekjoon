import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());

        int [] arr = new int[size];
        String [] str = bf.readLine().split(" ");

        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        MaxDifference arrPermutation = new MaxDifference();
        System.out.println(arrPermutation.calculateMaxDiff(arr, size));
    }
}

class MaxDifference {
    private int maxDiff = 0;

    public int calculateMaxDiff(int [] arr, int size){
        permutation(arr, 0, size);
        return maxDiff;
    }

    private int calculateDiff(int [] arr, int size){
        int sum = 0;
        for(int i = 0; i < size - 1; i++){
            sum += Math.abs(arr[i] - arr[i+1]);
        }
        return sum;
    }

    private void permutation(int[] arr, int depth, int size){
        if(depth == size){
            int result = calculateDiff(arr, size);
            maxDiff = Math.max(maxDiff, result);
        }

        for(int i = depth; i < arr.length; i++){
            Swap(arr, depth, i);
            permutation(arr, depth + 1, size);
            Swap(arr, depth, i);
        }
    }

    private void Swap(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}