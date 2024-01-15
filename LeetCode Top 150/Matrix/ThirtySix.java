import java.util.ArrayList;

public class ThirtySix {
    public static Boolean isValidSudoku(char[][] board) {
        // String[] currentRow = {};
        ArrayList<String> currentRow = new ArrayList<String>();
        ArrayList<String> currentColumn = new ArrayList<String>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (String.valueOf(board[j][i]) != ".") {
                    if (currentRow.contains(String.valueOf(board[j][i]))) {
                        return false;
                    } else {
                        currentRow.add(String.valueOf(board[j][i]));
                    }
                }
            }
            if (String.valueOf(board[0][i]) != ".") {
                if (currentRow.contains(String.valueOf(board[0][i]))) {
                    return false;
                } else {
                    currentRow.add(String.valueOf(board[0][i]));
                }
            }
        }
    }

}

public static void main(String[] args) {
    char[][] board1 = {{"5","3",".",".","7",".",".",".","."}
    ,{"6",".",".","1","9","5",".",".","."}
    ,{".","9","8",".",".",".",".","6","."}
    ,{"8",".",".",".","6",".",".",".","3"}
    ,{"4",".",".","8",".","3",".",".","1"}
    ,{"7",".",".",".","2",".",".",".","6"}
    ,{".","6",".",".",".",".","2","8","."}
    ,{".",".",".","4","1","9",".",".","5"}
    ,{".",".",".",".","8",".",".","7","9"}};



}