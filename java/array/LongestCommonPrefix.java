class Solution {
    public String longestCommonPrefix(String[] strs) {
        String min = strs[0];
        for(String s: strs){
            if(min.length()>s.length()){
                min = s;
            }
        }
        for(int i=min.length(); i>=0;i--){
            String temp = min.substring(0, i);
            boolean flag = true;
            for(String s: strs){
            if(!s.startsWith(temp)){
                flag = false;
                break;
            }
        }
            if(flag){
                return temp;
            }
        }
        return "";
    }
}