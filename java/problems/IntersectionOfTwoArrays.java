class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1 == 0 || n2 == 0)
            return new int[]{};
        Set<Integer> set = new HashSet<>();
        if(n1 < n2){
            for(int val: nums1)
                set.add(val);
            for(int val: nums2)
                if(set.contains(val) && !ans.contains(val))
                    ans.add(val);
        } else {
            for(int val: nums2)
                set.add(val);
            for(int val: nums1)
                if(set.contains(val) && !ans.contains(val))
                    ans.add(val);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}