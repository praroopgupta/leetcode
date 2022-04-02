class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int sum = 0, count=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            while(sum>=target){
                ans = Math.min(ans, i + 1 - count);
                sum-= nums[count++];
            }
        }
        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }
}