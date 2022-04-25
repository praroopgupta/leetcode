class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int n = s.length();
        if(n==1){
            return map.get(s.charAt(0));
        }
        int sum = 0;
        for(int i=n-1; i>0;){
            int temp = map.get(s.charAt(i-1)) == null ? 0 : map.get(s.charAt(i-1));
            if(map.get(s.charAt(i)) > temp) {
                sum += map.get(s.charAt(i)) - temp;
                i-=2;
            } else {
                sum += map.get(s.charAt(i));
                i--;
            }           
            System.out.print(sum + " ");
            if(i==0){
                sum += map.get(s.charAt(0));
            }
        }
        return sum;
   }
}