package Array.Lec.Day1;

import java.util.Arrays;

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
    }
}