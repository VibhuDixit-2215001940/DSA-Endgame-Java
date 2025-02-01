import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        // list.add(arr[i]);
        // }
        // System.out.println(list);

        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list = Arrays.asList(arr);
        // Collections.addAll(list,arr);
        System.out.println(list);
    }
}
