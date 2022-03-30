class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++){
            if(countDigit(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    int countDigit(int n){
        if(n/10 == 0){
            return 1;
        }
        return 1 + countDigit(n/10);
    }
}