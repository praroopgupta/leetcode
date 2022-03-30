class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
       List<Integer> ans = new ArrayList<>();
        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}