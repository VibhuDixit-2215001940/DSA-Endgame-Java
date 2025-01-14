import java.util.Scanner;

public class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }

        return result;
    }
    // public int[] productExceptSelf(int[] nums) {
    // int count = 0, pro = 1;
    // for (int i : nums) {
    // if (i == 0)
    // count++;
    // else
    // pro *= i;
    // }
    // int[] result = new int[nums.length];
    // if (count > 1)
    // return result;
    // else {
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] != 0) {
    // if (count > 0)
    // result[i] = 0;
    // else
    // result[i] = pro / nums[i];
    // } else
    // result[i] = pro;
    // }
    // }
    // return result;
    // }
    // public int[] productExceptSelf(int[] nums) {
    // int n = nums.length;
    // int[] left = new int[n];
    // int[] right = new int[n];
    // left[0] = 1;
    // right[n - 1] = 1;

    // for (int i = 1; i < n; i++) {
    // left[i] = left[i - 1] * nums[i - 1];
    // }

    // for (int i = n - 2; i >= 0; i--) {
    // right[i] = right[i + 1] * nums[i + 1];
    // }

    // int[] result = new int[n];
    // for (int i = 0; i < n; i++) {
    // result[i] = left[i] * right[i];
    // }

    // return result;
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        ProductOfArrayExceptItself solution = new ProductOfArrayExceptItself();
        int[] result = solution.productExceptSelf(nums);

        System.out.println("The product array is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}