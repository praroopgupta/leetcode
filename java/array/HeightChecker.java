import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;
        int[] copy = Arrays.copyOf(heights, n);
        Arrays.sort(copy);
        for(int i=0; i<n; i++){
            if(heights[i]!=copy[i]){
                count++;
            }
        }
        return count;
    }
}