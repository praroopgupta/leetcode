class Solution {
    public boolean isPowerOfThree(int n) {
       if(n<=0)
           return false;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(3, 1);
        map.put(9, 2);
        map.put(7, 3);
        map.put(1, 4);        
        int last = n % 10;
        if(!map.containsKey(last)) {
            return false;
        }
        int val = map.get(last);
        double cube = Math.pow(3, val);
        while (cube <= n) {
            if (cube == n)
                return true;
            val = val + 4;
            cube = Math.pow(3, val);      
        }
        return false;
    }
}