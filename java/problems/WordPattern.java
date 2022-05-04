class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        char[] ch = pattern.toCharArray();
        String[] st= s.split(" ");
        if(ch.length != st.length)
            return false;
        int n = ch.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(ch[i])) {
                String temp = map.get(ch[i]);
                if(!temp.equalsIgnoreCase(st[i]))
                    return false;
            } else if(!map.containsKey(ch[i]) && set.contains(st[i])) {
                return false;
            }else {
                map.put(ch[i], st[i]);
                set.add(st[i]);
            }
        }
        return true;
    }
}