class Solution {
    public int majorityElement(int[] arr) {
        int count = 0, ele = -1;
        for (int x : arr) {
            if (count == 0)
                ele = x;
            if (x == ele)
                count++;
            else
                count--;
        }
        return ele;
    }
}
// First, choose a candidate from the given set of elements if it is the same as
// the candidate element, increase the votes. Otherwise, decrease the votes if
// votes become 0, select another new element as the new candidate.