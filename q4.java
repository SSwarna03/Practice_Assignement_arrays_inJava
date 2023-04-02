import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largePrime = -1;
        for (int num : arr) {
            if (isPrime(num) && num > largePrime) {
                largePrime = num;
            }
        }

        if (largePrime == -1) {
            System.out.println("There are no prime numbers in the array.");
        } else {
            System.out.println("The largest prime number in the array is: " + largePrime);
        }
    }
    


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

