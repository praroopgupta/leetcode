class Solution {
    public int reverse(int x) {
        String sign = null;
        if(x < 0){
            sign = "-";
            x = x * -1;
        }
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ans = sb.toString();
        ans.replaceFirst("^0+(?!$)", "");
        if(sign != null) {
            String temp = sign + ans;
            try {
                return Integer.parseInt(temp);
            } catch (Exception e) {
                return 0;
            }
        }
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }
}