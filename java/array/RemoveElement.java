import java.util.Arrays;
class Solution {
    public int removeElement(int[] nums, int val) {
        int[] ans = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!= val){
                ans[j] = nums[i];
                j++;
            } else{
                nums[i] = 0;
            }
        }
        System.arraycopy(ans, 0, nums, 0, j);
        return j;
        
    }
}