class Solution {

    public boolean isValidSudoku(char[][] board) {

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {

                if(board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '1';   // convert '1'-'9' → 0-8
                int boxIndex = (i / 3) * 3 + (j / 3);

                if(rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }

                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}// Time complexity: O(1) because the board size is fixed (9x9), so we are performing a constant number of operations. The space complexity is also O(1) because we are using fixed-size boolean arrays to track the presence of numbers in rows, columns, and boxes.