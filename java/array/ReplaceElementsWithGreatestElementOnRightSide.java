class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1){
            arr[0] = -1;
        }
        int j = 0;
        while (j < arr.length-1){
            arr[j] = arr[j+1];
            for(int i=j+1;i<arr.length; i++){ 
            if(arr[i] > arr[j]){
                arr[j] = arr[i];
                }
            }
        j++;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}