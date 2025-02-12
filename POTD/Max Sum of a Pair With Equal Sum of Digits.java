class Solution {
    public static int findSum(int number) {
        return number == 0 ? 0 : number % 10 + findSum(number / 10);
    }

    public int maximumSum(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int num : nums) {
            int sum = findSum(num);
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(num);
        }
        int maxSum = -1;
        for (List<Integer> arr : map.values()) {
            if (arr.size() >= 2) {
                int firstMax = 0, secondMax = 0;
                for (int x : arr) {
                    if (x > firstMax) {
                        secondMax = firstMax;
                        firstMax = x;
                    } else if (x > secondMax)
                        secondMax = x;
                }
                maxSum = Math.max(maxSum, firstMax + secondMax);
            }
        }
        return maxSum;
    }
}
