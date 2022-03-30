class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                ans[j] = nums[i];
                j++;
            }
        }
        for(int i=j; i<ans.length;i++){
            ans[j]= 0;
        }
        System.arraycopy(ans, 0, nums, 0, ans.length);       
    }
}