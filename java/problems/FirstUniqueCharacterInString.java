class Solution {
    public int firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(!s.substring(i+1, s.length()).contains(String.valueOf(s.charAt(i))) && !set.contains(s.charAt(i))){
                return i;
            }
            set.add(s.charAt(i));
        }
        return -1;
    }
}