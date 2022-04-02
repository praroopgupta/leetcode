class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[n];
        System.arraycopy(nums, 0, temp, 0, n);
        while(k>0){
            temp = rightShiftOne(temp, n);
            k--;
        }
       System.arraycopy(temp, 0, nums, 0, n);
       //printArray(nums);
    }
    int[] rightShiftOne(int[] arr, int n){
        int temp[] = new int[n];
        temp[0] = arr[n-1];
        System.arraycopy(arr, 0, temp, 1, n-1);
        //printArray(temp);
        return temp;
    }
    void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}