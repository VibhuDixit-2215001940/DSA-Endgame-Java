import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        for (int turn = 1; turn < n; turn++) {
            for (int j = 0; j < n - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println("Sorted array in ascending order:");
        System.out.println(Arrays.toString(arr));
    }
}
