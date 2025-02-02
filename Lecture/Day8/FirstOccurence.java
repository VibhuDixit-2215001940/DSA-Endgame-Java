public class FirstOccurence {
    public static int find(int i, int[] arr, int target) {
        if (i > arr.length - 1)
            return -1;
        if (arr[i] == target)
            return i;
        return find(i + 1, arr, target);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 3, 4, 3, 5 };
        int target = 30;
        System.out.println(find(0, arr, target));
    }
}
