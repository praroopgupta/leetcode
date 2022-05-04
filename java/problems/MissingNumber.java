class Solution {
    public int missingNumber(int[] nums) {
    int n = nums.length;
    int total = (n * ( n + 1))/2;
    int sum = IntStream.of(nums).sum();
    return total - sum;
    }
}