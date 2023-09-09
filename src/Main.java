import java.util.Scanner;

public class Main {

    public static boolean isPrime(int num){

        if(num <= 1){
            return false;
        }
        if( num <= 3 ) return true;
        if(num == 4) return false;
        for (int i = 2; i < num/2 ; i++){
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int[] prime_numbers(int n){

        int[] newArr = new int[n];
        int count = 0;
        int i = 2;

        while (count < n){

            if(isPrime(i)){
                newArr[count] = i;
                count++;
            }
            i++;
        }

        return newArr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] output = prime_numbers(n);
        for (int i = 0; i < n; i++){
            System.out.println(output[i]);
    }
    }
}