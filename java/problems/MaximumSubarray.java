class Solution {
    public int maxSubArray(int[] nums) {  
        int max = nums[0], sum = nums[0], n = nums.length;        
        for(int i=1; i<n; i++) {
            sum = Math.max(nums[i], sum+nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}