class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || null == s){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int max = 0, count = 0, n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(s.charAt(i))) {
                int index = map.get(s.charAt(i));
                s = s.substring(index+1, n);
                n = s.length();
                map = new HashMap<>();
                i=0;
                map.put(s.charAt(i), i);               
                count = 1;
            } else {
                map.put(s.charAt(i), i);
                count++;
                if(max < count){
                    max = count;
                }
            }
        }
        return max;
    }
}