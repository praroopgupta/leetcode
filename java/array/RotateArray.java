class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[n];
        if(k > n){
            k = k%n;           
        }
        if(k < n){
            System.arraycopy(nums, 0, temp, 0, n);
            System.arraycopy(nums, n-k, temp, 0, k);
            System.arraycopy(nums, 0, temp, k, n-k);
            System.arraycopy(temp, 0, nums, 0, n);
        }
    }
}