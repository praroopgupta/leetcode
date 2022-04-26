class Solution {
    public String addBinary(String a, String b) {
        int na = a.length();
        int nb = b.length();
        if(na > nb) {
            b= "0".repeat(na - nb) + b;
            System.out.println(a);
            System.out.println(b);
        } else if (na < nb) {
             a= "0".repeat(nb - na) + a;
             System.out.println(a);
             System.out.println(b);
        }
        char[] ar = a.toCharArray();
        char[] br = b.toCharArray();
        int carry = 0;
        StringBuilder sb = new StringBuilder("");
        for (int i=ar.length -1; i>=0; i--){           
            if(ar[i] == '1' && br[i] == '1'){
                if(carry == 1) {
                    sb.append("1");
                    carry = 1;
                } else {
                    sb.append("0");
                    carry = 1;
                }
            }
            else if(ar[i] == '0' && br[i] == '0'){
                if(carry == 1){
                    sb.append("1");
                    carry = 0;
                } else {
                    sb.append("0");
                }            
            } else {
                if (carry == 1 ) {
                    sb.append("0");
                } else {
                    sb.append("1");
                }
            }
        }
        if(carry == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}