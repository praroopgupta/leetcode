class Solution {
    public String reverseWords(String s) {
        String str[] = s.split("\\s+");
        String arr[] = new String[str.length];
        for(int i=0; i<str.length; i++){
            arr[i] = reverseString(str[i].toCharArray());
        }
        return Stream.of(arr).collect(Collectors.joining(" ")).trim();
    }
    
    String reverseString(char[] s) {
        int i=0;
        int j = s.length-1;
        while(i<j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
        return new String(s);
    }
}