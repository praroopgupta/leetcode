import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int[] array = set.stream().mapToInt(Number::intValue).toArray();
        Arrays.sort(array);
        int highest = 0;
        int n = array.length;
        if(n==2){
            highest = 1;
        }
        if(n > 3){
            highest = n - 3;
        } 
        return array[highest];        
    }
}