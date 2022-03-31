class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0 && needle.length() == 0){
            return 0;
        }
        if(haystack.contains(needle)){
            for(int i=0; i<haystack.length(); i++){
                if(haystack.substring(i,haystack.length()).startsWith(needle)){
                    return i;
                }
            }
        } 
        return -1;
    }
}