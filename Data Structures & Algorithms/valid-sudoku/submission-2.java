class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            boolean[] seen = new boolean[9];
            for (int j = 0; j < board[0].length; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                int idx = c - '1';
                if (seen[idx]) {
                    return false;
                } else {
                    seen[idx] = true;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            boolean[] seen = new boolean[9];
            for (int j = 0; j < board[0].length; j++) {
                char c = board[j][i];
                if (c == '.') {
                    continue;
                }
                int idx = c - '1';
                if (seen[idx]) {
                    return false;
                } else {
                    seen[idx] = true;
                }
            }
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] seen = new boolean[9];
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        char c = board[i][j];

                        if (c == '.') {
                            continue;
                        }
                        int idx = c - '1';
                        if (seen[idx]) {
                            return false;
                        } else {
                            seen[idx] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
