class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for(int i=0;i<s.length(); i++) {
            if(sMap.containsKey(s.charAt(i)))
                sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
            else
                sMap.put(s.charAt(i), 1);
            if(tMap.containsKey(t.charAt(i)))
                tMap.put(t.charAt(i), tMap.get(t.charAt(i))+1);
            else
                tMap.put(t.charAt(i), 1);
        }
        for(Map.Entry<Character, Integer> entry: sMap.entrySet()) {
            char ch = entry.getKey();
            int val = entry.getValue();
            if(null == tMap.get(ch) || tMap.get(ch) != val){
                return false;
            }
        }
        return true;
    }
}