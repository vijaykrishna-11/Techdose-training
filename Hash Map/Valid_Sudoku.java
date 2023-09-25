
public class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            int hash[] = new int[10];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    hash[board[i][j] - '0']++;
                    if (hash[board[i][j] - '0'] > 1) {
                        return false;
                    }
                }

            }
        }
        for (int i = 0; i < 9; i++) {
            int hash[] = new int[10];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    hash[board[j][i] - '0']++;
                    if (hash[board[j][i] - '0'] > 1) {
                        return false;
                    }
                }

            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int hash[] = new int[10];
                for (int k = i; k < i + 3; k++) {
                    for (int h = j; h < j + 3; h++) {
                        if (board[k][h] != '.') {
                            hash[board[k][h] - '0']++;
                            if (hash[board[k][h] - '0'] > 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
