class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        List<Boolean> ll = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            max = Math.max(max, arr[i]);
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + extraCandies) >= max)
                ll.add(true);
            else
                ll.add(false);
        }
        return ll;
    }
}