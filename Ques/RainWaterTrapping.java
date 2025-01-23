import java.util.Scanner;

public class RainWaterTrapping {
    public int[] leftMax(int[] arr, int n) {
        int[] l = new int[n];
        l[0] = arr[0];
        for (int i = 1; i < n; i++)
            l[i] = Math.max(l[i - 1], arr[i]);
        return l;
    }

    public int[] rightMax(int[] arr, int n) {
        int[] r = new int[n];
        r[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            r[i] = Math.max(r[i + 1], arr[i]);
        return r;
    }

    public int trap(int[] arr) {
        int n = arr.length, ans = 0;
        int[] l = leftMax(arr, n);
        int[] r = rightMax(arr, n);
        for (int i = 0; i < n; i++)
            ans += Math.min(l[i], r[i]) - arr[i];
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
        RainWaterTrapping solution = new RainWaterTrapping();
        int result = solution.trap(arr);
        System.out.println("The amount of water trapped is: " + result);
        sc.close();
    }
}
