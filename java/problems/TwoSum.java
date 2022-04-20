class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i=0;
        int j = i+1;
        while(i<j){
            if(nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
            if(j==n-1){
                i++;
                j=i+1;
            } else {
                j++;
            }
            if(i==n-1){
                break;
            }
        }
        return new int[]{};
    }
}