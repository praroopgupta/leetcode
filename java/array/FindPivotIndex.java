class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        for(int i: nums){
            sum+=i;
        }
        for(int i=0; i<n;i++){
            if(left == sum - left -nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}