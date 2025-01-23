import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int min = minElementIndex(arr, i);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static int minElementIndex(int[] arr, int i) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        selectionSort(arr, n);
        System.out.println("Sorted array in ascending order:");
        System.out.println(Arrays.toString(arr));
    }
}
