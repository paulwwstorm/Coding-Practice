public class NineHundredAndNine {
    public int snakesAndLadders(int[][] board) {
        int endpoint = board.length*board[0].length;
        int currLocation = 1;
        int moveCounter = 0;

        while (currLocation < endpoint) {
            int farthestMove = 0;
            System.out.println("This role: ");
            

            for (int i = 1; i < 7; i++) {
                Boolean oddRow = (currLocation / board[0].length) % 2 == 0;
                int currentMove = 0;
                if (oddRow) {
                    currentMove = board[currLocation / board[0].length][board[0].length - (((currLocation + i) % board[0].length) + 1)];
                } else {
                    currentMove = board[currLocation / board[0].length][(currLocation + i) % board[0].length];
                }

                if (currentMove < 0) {
                    currentMove = currLocation + i;
                }

                if (currentMove > farthestMove) {
                    currLocation = currentMove;
                }
                System.out.println(String.valueOf(currentMove));
            }

            currLocation = currLocation + 6;
            moveCounter++;
        }

        return 1;
    }
}
