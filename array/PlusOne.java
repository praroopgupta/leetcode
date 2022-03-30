class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits = addOne(digits, n-1);
        return digits;        
    }   
    int[] addOne(int[] d, int i){
        if(d[i] == 9){
            if(i != 0) {
                d[i] = 0;
                d = addOne(d, i-1);
            } else {
                d[i] = 0;
                int[] ans = new int[d.length+1];
                System.arraycopy(d, 0, ans, 1, d.length);
                d = addOne(ans, i);
            }
        } else {
            d[i] = d[i] + 1;
        }
        return d;
    }
}