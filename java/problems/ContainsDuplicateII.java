class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        Map<Integer, String> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) != null){
                map.put(nums[i], (map.get(nums[i]) + (","+i)));
            } else {
                map.put(nums[i], String.valueOf(i));
            }
        }
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            String[] arr = entry.getValue().split(",");
            int n = arr.length;
            if(n >=2 ){
                for(int i=0; i<n-1; i++){
                    for(int j=i+1; j<n; j++){
                        if(k >= Integer.parseInt(arr[j]) - Integer.parseInt(arr[i])) {
                            result = true;
                            break;
                        }
                    }
                }
            } else {
                continue;
            }
        }
        return result;
    }
}