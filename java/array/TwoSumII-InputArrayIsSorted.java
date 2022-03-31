class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0, j=n-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum>target){
                j--;
            } else if(sum<target){
                i++;
            } else{
                return new int[]{i+1, j+1};
            }
        }
        return null;
    }
}