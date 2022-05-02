    class Solution {
    public int addDigits(int num) {
        if(num >= 0 && num <=9)
            return num;
        while(num >= 10){
            int a = num %10;
            int b = num /10;
            num = a + b;
        }
        return num;
    }
}