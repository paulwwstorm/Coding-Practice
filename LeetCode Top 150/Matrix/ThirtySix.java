import java.util.ArrayList;

public class ThirtySix {
    public static Boolean isValidSudoku(char[][] board) {
        // String[] currentRow = {};
        ArrayList<Character> currentColumn = new ArrayList<Character>();
        ArrayList<Character> currentRow = new ArrayList<Character>();
        ArrayList<Character> currentGrid = new ArrayList<Character>();
        ArrayList<Character> currentGrid = new ArrayList<Character>();
        ArrayList<Character> grid1 = new ArrayList<Character>();
        ArrayList<Character> grid2 = new ArrayList<Character>();
        ArrayList<Character> grid3 = new ArrayList<Character>();
        ArrayList<Character> grid4 = new ArrayList<Character>();
        ArrayList<Character> grid5 = new ArrayList<Character>();
        ArrayList<Character> grid6 = new ArrayList<Character>();
        ArrayList<Character> grid7 = new ArrayList<Character>();
        ArrayList<Character> grid8 = new ArrayList<Character>();
        ArrayList<Character> grid9 = new ArrayList<Character>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!String.valueOf(board[j][i]).equals(".")) {
                    if (currentColumn.contains((board[j][i]))) {
                        return false;
                    } else {
                        currentColumn.add(board[j][i]);
                    }
                }
                if (!String.valueOf(board[i][j]).equals(".")) {
                    if (currentRow.contains((board[i][j]))) {
                        return false;
                    } else {
                        currentRow.add(board[i][j]);
                    }
                }
            }

            currentRow.clear();
            currentColumn.clear();
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board1 = {
                { "5".charAt(0), "3".charAt(0), ".".charAt(0), ".".charAt(0), "7".charAt(0), ".".charAt(0),
                        ".".charAt(0), ".".charAt(0), ".".charAt(0) },
                { "6".charAt(0), ".".charAt(0), ".".charAt(0), "1".charAt(0), "9".charAt(0), "5".charAt(0),
                        ".".charAt(0), ".".charAt(0), ".".charAt(0) },
                { ".".charAt(0), "9".charAt(0), "8".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0),
                        ".".charAt(0), "6".charAt(0), ".".charAt(0) },
                { "8".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "6".charAt(0), ".".charAt(0),
                        ".".charAt(0), ".".charAt(0), "3".charAt(0) },
                { "4".charAt(0), ".".charAt(0), ".".charAt(0), "8".charAt(0), ".".charAt(0), "3".charAt(0),
                        ".".charAt(0), ".".charAt(0), "1".charAt(0) },
                { "7".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "2".charAt(0), ".".charAt(0),
                        ".".charAt(0), ".".charAt(0), "6".charAt(0) },
                { ".".charAt(0), "6".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0),
                        "2".charAt(0), "8".charAt(0), ".".charAt(0) },
                { ".".charAt(0), ".".charAt(0), ".".charAt(0), "4".charAt(0), "1".charAt(0), "9".charAt(0),
                        ".".charAt(0), ".".charAt(0), "5".charAt(0) },
                { ".".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "8".charAt(0), ".".charAt(0),
                        ".".charAt(0), "7".charAt(0), "9".charAt(0) } };

        String[][] board2Strings = {
                { "8", "3", ".", ".", "7", ".", ".", ".", "." },
                { "6", ".", ".", "1", "9", "5", ".", ".", "." },
                { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                { "8", ".", ".", ".", "6", ".", ".", ".", "3" },
                { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                { "7", ".", ".", ".", "2", ".", ".", ".", "6" },
                { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                { ".", ".", ".", "4", "1", "9", ".", ".", "5" },
                { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };

        char[][] board2 = new char[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board2[i][j] = board2Strings[i][j].charAt(0);
            }
        }

        String[][] board3Strings = {
                { "7", ".", ".", ".", "4", ".", ".", ".", "." },
                { ".", ".", ".", "8", "6", "5", ".", ".", "." },
                { ".", "1", ".", "2", ".", ".", ".", ".", "." },
                { ".", ".", ".", ".", ".", "9", ".", ".", "." },
                { ".", ".", ".", ".", "5", ".", "5", ".", "." },
                { ".", ".", ".", ".", ".", ".", ".", ".", "." },
                { ".", ".", ".", ".", ".", ".", "2", ".", "." },
                { ".", ".", ".", ".", ".", ".", ".", ".", "." },
                { ".", ".", ".", ".", ".", ".", ".", ".", "." } };

        char[][] board3 = new char[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board3[i][j] = board3Strings[i][j].charAt(0);
            }
        }

        String[][] board4Strings = {
                { ".", ".", ".", ".", "5", ".", ".", "1", "." },
                { ".", "4", ".", "3", ".", ".", ".", ".", "." },
                { ".", ".", ".", ".", ".", "3", ".", ".", "1" },
                { "8", ".", ".", ".", ".", ".", ".", "2", "." },
                { ".", ".", "2", ".", "7", ".", ".", ".", "." },
                { ".", "1", "5", ".", ".", ".", ".", ".", "." },
                { ".", ".", ".", ".", ".", "2", ".", ".", "." },
                { ".", "2", ".", "9", ".", ".", ".", ".", "." },
                { ".", ".", "4", ".", ".", ".", ".", ".", "." } };

        System.out.println(isValidSudoku(board1));
        System.out.println(isValidSudoku(board2));
        System.out.println(isValidSudoku(board3));

    }

}