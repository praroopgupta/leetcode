class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean result = false;
        int m = board.length;
        int n = board[0].length;
        if (m!=n || m!= 9 || n!=9)
            return false;
        result = validateRows(board, m, n);
        System.out.println("Validate Rows: "+result);
        if(result){
             result = validateCols(board, m, n);
        }
        System.out.println("Validate Cols: "+result);
        if(result){
             result = validateSubBoxes(board, m, n);
        }
        System.out.println("Validate Sub Boxes: "+result);
        return result;
    }
    boolean validateRows(char[][] board, int m, int n){
        for(int i=0; i<m; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<n; j++){
                if(set.contains(board[i][j])){
                    return false;
                } else if (board[i][j] != '.') {
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
    boolean validateCols(char[][] board, int m, int n){
        for(int i=0; i<m; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<n; j++){
                if(set.contains(board[j][i])){
                    return false;
                } else if (board[j][i] != '.') {
                    set.add(board[j][i]);
                }
            }
        }
        return true;
    }
    boolean validateSubBoxes(char[][] board, int m, int n){
        int row =0; int col = 0;
        while(row<m && col <n) {
            Set<Character> set = new HashSet<>();
            for(int i=row; i<row+3; i++){
                for(int j=col; j<col+3; j++){
                    if(set.contains(board[i][j])){
                        return false;
                    } else if (board[i][j] != '.'){
                        set.add(board[i][j]);
                    }
                }
            }
            col+=3;
            if(col == 9){
                col = 0;
                row+=3;
            }
        }    
        return true;
    }
}