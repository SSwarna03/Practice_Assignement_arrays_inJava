import java.util.Scanner;

public class MovingOnesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int end = n - 1;
        for (int i = 0; i < end;) {
            if (arr[i] == 1) {
                swap(arr, i, end);
                end--;
            } else {
                i++;
            }
        }

        System.out.println("Array with ones moved to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}