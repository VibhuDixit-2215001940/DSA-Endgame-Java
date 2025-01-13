import java.util.Scanner;

public class RainWaterTrapping2 {
    public int trap(int[] arr) {
        int l = 0, r = arr.length - 1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans = 0;
        while (l < r) {
            lmax = Math.max(lmax, arr[l]);
            rmax = Math.max(rmax, arr[r]);
            ans += (lmax < rmax) ? lmax - arr[l++] : rmax - arr[r--];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        RainWaterTrapping2 solution = new RainWaterTrapping2();
        int result = solution.trap(arr);
        System.out.println("The amount of water trapped is: " + result);
        sc.close();
    }
}
