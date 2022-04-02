class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i =1; i<=numRows; i++){
            List<Integer> list = new ArrayList<>();
            list = createPascalRow(i);
            ans.add(list);
        }
        return ans;
    }
    List<Integer> createPascalRow(int n) {
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i=1; i<=n;i++){
            list.add(count);
            count = count * (n - i) / i;
        }
        return list;
    }
}