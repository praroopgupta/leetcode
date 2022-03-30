class Solution {
    public void duplicateZeros(int[] arr) {
        int size = arr.length;
        for(int i=0; i<size;i++){
            if(arr[i] == 0){
                int[] shiftarr = shiftArray(arr, i++);
            }
        }
    }
    int[] shiftArray(int[] arr, int index){
        for(int i = arr.length-2; i>=index;i--){
            arr[i+1] = arr[i];
        }
        arr[index] = 0;
        return arr;
    }
}