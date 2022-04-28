class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = Math.min(n1, n2);
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(n1 > n2) {
                if(isIntersect(nums2[i], nums1)) {
                    ans.add(nums2[i]);
                }
            } else {
                if(isIntersect(nums1[i], nums2)) {
                    ans.add(nums1[i]);
                }
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
    boolean isIntersect(int target, int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(target == arr[i]) {
                arr[i] = -1;
                return true;
            }
        }
        return false;
    }
}