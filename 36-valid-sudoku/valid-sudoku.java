class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] square = new HashSet[9];

        for(int i = 0;i<9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            square[i] = new HashSet<>();
        }
        for(int r =0;r<9;r++){
            for(int c=0;c<9;c++){
                char val = board[r][c];
                if(val =='.') continue;

                int squareIndex = (r/3)*3 + (c/3);

                if(rows[r].contains(val)||cols[c].contains(val)||square[squareIndex].contains(val)) return false;

                rows[r].add(val);
                cols[c].add(val);
                square[squareIndex].add(val);
            }
        }
        return true;
    }
}