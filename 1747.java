import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        for(int i = num; i <= Integer.MAX_VALUE; i++){
            if(i < 10){
                if(prime(i) == 1){
                    System.out.println(i);
                    break;
                }
            }
            else if(palindrome(i) == 1 && prime(i) == 1){
                System.out.println(i);
                break;
            }
        }
    }

    static int palindrome(int num){
        String str = num + "";

        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return -1;
            }
        }

        return 1;
    }

    static int prime(int num){
        if(num == 1)
           return -1;

        for(int i = 2; i < num; i++){
            if(num % i == 0)
                return -1;
        }

        return 1;
    }
}
