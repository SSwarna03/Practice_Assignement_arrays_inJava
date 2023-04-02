import java.util.*;

public class FrequencyElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array 1: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of array 1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of array 2: ");
        int n2= sc.nextInt();

        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of array 2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            int num = arr1[i];
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        System.out.println("Frequency of elements in array 2:");
        for (int i = 0; i < n2; i++) {
            int num = arr2[i];
            if (freqMap.containsKey(num)) {
                System.out.println("Frequency of " + num + ": " + freqMap.get(num));
            } else {
                System.out.println("Frequency of " + num + ": 0");
            }
        }
    }
}