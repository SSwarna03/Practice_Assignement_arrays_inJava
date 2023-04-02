import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = arr.length;
        int minValue = arr[0];
        int maxValue = arr[0];
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            sum += arr[i];
        }
        double avg = sum / n;
        
        System.out.println("Count: " + count);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Average value: " + avg);
    }
}