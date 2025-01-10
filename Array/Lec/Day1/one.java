package Array.Lec.Day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class one {
    public static void main(String[] args) {
        // --------------------------------------------
        // int a = 10;
        // int[] arr = null;
        // System.out.println(a);// 10
        // System.out.println(arr);// null

        // // ------------------ADDRESS -------------------
        // int[] arr = new int[5];
        // System.out.println(arr);// [I@4617c264
        // // [ --> denotes 1D array
        // // I --> denotes Data type of array in this case integer array

        // -------------------REFERRRENCE-----------------
        // int[] arr1 = new int[5];
        // int[] arr2 = arr1;
        // System.out.println(arr1);// [I@4617c264
        // System.out.println(arr2);// [I@4617c264
        // arr2[0] = 100;
        // System.out.println(arr1[0]);// 100
        // Arrays in Java are stored in contiguous memory blocks, making indexing very
        // fast (O(1)).
        // // In array the copy takes place by refference means the second array just
        // // pointing to the first array so the change in first array will reflect in
        // // second array also

        // -------------------SET & GET-----------------
        // int[] arr = { 1, 2, 3 };
        // java.lang.reflect.Array.set(arr, 0, 99);
        // System.out.println(java.lang.reflect.Array.get(arr, 0)); // Outputs: 99
        // System.out.println(arr[0]); // Outputs: 99

        // -------------------JAGGED ARRAY-----------------
        // int[][] arr = { { 1 }, { 2, 3 } };
        // System.out.println(arr[0][0]);// 1

        // -------------------ARRAY OF OBJECTS-----------------
        // Object[] arr = new Object[5];
        // arr[0] = new int[5];
        // arr[1] = new int[5];
        // arr[0][0] = 10;
        // System.out.println(arr[0][0]);// 10
        // // Array of objects can hold any type of object

        // -------------------OUT OF BOUND-----------------
        // int[] arr = new int[5];
        // arr[5] = 10; // Throws ArrayIndexOutOfBoundsException
        // System.out.println(arr[5]); // Throws ArrayIndexOutOfBoundsException

        // --------------------TRAVERSING------------------
        // int[] arr = { 0, 1, 2, 3, 4 };
        // for (int i = 0; i < 5; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // for (int x : arr)// More preferrable
        // System.out.print(x + " ");

        // ---------------------DECLARATION----------------
        // int[] arr = new int[5];// Java type declaration
        // int arr1[] = new int[5];// C type declaration

        // ----------------------SWAP----------------
        // int a = 5, b = 10;
        // System.out.println("Before Swap: a = " + a + ", b = " + b);
        // // Swap logic
        // a = a + b; // a becomes 15
        // b = a - b; // b becomes 5 (original value of a)
        // a = a - b; // a becomes 10 (original value of b)
        // System.out.println("After Swap: a = " + a + ", b = " + b);

        // ----------------------SEARCH----------------
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int key = 3;
        // int index = Arrays.binarySearch(arr, key);
        // System.out.println(index);// 2

        // ----------------------SORT------------------
        // int[] arr = { 5, 4, 3, 2, 1 };
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));// [1, 2, 3, 4, 5]

        // ----------------------MAX ELE------------------
        // int[] arr = { 1, 5, 3, 9, 2 };
        // int max = Arrays.stream(arr).max().orElseThrow(); // Get max value
        // System.out.println("Max element: " + max); // Output: 9

        // List<Integer> list = Arrays.asList(3, 5, 7, 2, 8);
        // int max = Collections.max(list);
        // System.out.println("Max element: " + max);// 8

        // -----------------------REVERSE-------------------
        int[] arr = { 1, 2, 3, 4, 5 };
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr)); // Output: [5, 4, 3, 2, 1]
    }
}