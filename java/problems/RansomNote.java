class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        for(int i=0;i<ransomNote.length(); i++) {
            if(ransomNoteMap.containsKey(ransomNote.charAt(i)))
                ransomNoteMap.put(ransomNote.charAt(i), ransomNoteMap.get(ransomNote.charAt(i))+1);
            else
                ransomNoteMap.put(ransomNote.charAt(i), 1);
        }
        Map<Character, Integer> magazineMap = new HashMap<>();
        for(int i=0;i<magazine.length(); i++) {
            if(magazineMap.containsKey(magazine.charAt(i)))
                magazineMap.put(magazine.charAt(i), magazineMap.get(magazine.charAt(i))+1);
            else
                magazineMap.put(magazine.charAt(i), 1);
        }      
        for(Map.Entry<Character, Integer> entry: ransomNoteMap.entrySet()) {
            char ch = entry.getKey();
            int val = entry.getValue();
            if(null != magazineMap.get(ch) && magazineMap.get(ch) >= val){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}