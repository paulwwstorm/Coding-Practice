public class NineHundredAndNine {
    public int snakesAndLadders(int[][] board) {
        int endpoint = board.length*board[0].length;
        int currLocation = 1;
        int moveCounter = 0;

        // So I clearly need something recursive here
        // I think the thing I am concerned about is the end state
        // So I think I want to write a function that that checks
        // Whether or not the game can be won within one dice roll

        public int endCheck(int currLocation, int endpoint, int[][] board, int moveCounter) {
            if (currLocation < endpoint && (currLocation + 6) >= endpoint) {
                moveCounter++;
            } else {
                
                int bestMove = endpoint;
    
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
                    int currentRoll = endCheck(currentMove, endpoint, board, moveCounter);
                    if (currentRoll < bestMove) {
                        bestMove = currentRoll;
                    }
                }
    
                moveCounter = bestMove;
            }
    
            return moveCounter;
        }
    
        public int snakesAndLadders(int[][] board) {
            int endpoint = board.length*board[0].length;
            int currLocation = 1;
            int moveCounter = 0;
    
            return endCheck(currLocation, endpoint, board, moveCounter);
        }

        return moveCounter;
    }
}

// while (currLocation < endpoint) {
//     int farthestMove = 0;
//     System.out.println("Current space: ");
//     System.out.println(String.valueOf(currLocation));
//     System.out.println("This roll: ");
//     for (int i = 1; i < 7; i++) {
//         Boolean oddRow = (currLocation / board[0].length) % 2 == 0;
//         int currentMove = 0;
//         if (oddRow) {
//             currentMove = board[currLocation / board[0].length][board[0].length - (((currLocation + i) % board[0].length) + 1)];
//         } else {
//             currentMove = board[currLocation / board[0].length][(currLocation + i) % board[0].length];
//         }
//         System.out.println(String.valueOf(currentMove));
//         if (currentMove < 0) {
//             currentMove = currLocation + i;
//         }
//         if (currentMove > farthestMove) {
//             farthestMove = currentMove;
//         }
//     }
//     System.out.println("Farthest move: ");
//     System.out.println(String.valueOf(farthestMove));
//     currLocation = farthestMove;
//     moveCounter++;
// }
