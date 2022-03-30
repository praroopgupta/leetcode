class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int result = 0;
        for(int i=0; i< nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                result = i;
            }
        }
        for(int i=0; i< nums.length; i++){
            if(max == nums[i]){
                continue;
            }
            if(max < 2 * nums[i]) {
                result = -1;
            }
        }  
        return result;
    }
}