import java.util.*;
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(seen.contains(2 * arr[i]) || seen.contains(arr[i]/2) && arr[i]%2==0){
                return true;
            } else {
                seen.add(arr[i]);
            }
            } 
         return false;
        }
}