public class NineHundredAndNine {
    class Solution {
    public int endCheck(int currLocation, int endpoint, int[][] board, int moveCounter) {
        System.out.println("Endcheck initiated");
        System.out.println(String.valueOf(currLocation));

        if (currLocation < endpoint) {
            // int bestMove = endCheck((currLocation + 6), endpoint, board, moveCounter + 1);
            int bestMove = endpoint;
            int highestRoll = 0;

            for (int i = 6; i > 0; i--) {
                // System.out.println("i:");
                // System.out.println(String.valueOf(i));
                // System.out.println("Current Location");
                // System.out.println(String.valueOf(currLocation));
                Boolean oddRow = (currLocation / board[0].length) % 2 == 0;
                int currentMove = 0;
                int currentRoll = endpoint;
                if (oddRow) {
                    currentMove = board[currLocation / board[0].length][((currLocation + i) % board[0].length)];
                    board[currLocation / board[0].length][board[0].length - (((currLocation + i) % board[0].length) + 1)] = -1;
                } else {
                    currentMove = board[currLocation / board[0].length][board[0].length - (((currLocation + i) % board[0].length) + 1)];
                    board[currLocation / board[0].length][(currLocation + i) % board[0].length] = -1;
                }

                System.out.println(String.valueOf(currentMove));

                if (currentMove > 0) {
                    System.out.println("Snake/ladder");
                    System.out.println("i:");
                    System.out.println(String.valueOf(i));
                    System.out.println("Current Location");
                    System.out.println(String.valueOf(currLocation));
                    // currentRoll = endCheck(currentMove, endpoint, board, moveCounter + 1);
                } else if (i > highestRoll) {
                    System.out.println("highest roll");
                    System.out.println(String.valueOf(currLocation + i));
                    // currentRoll = endCheck(currLocation + i, endpoint, board, moveCounter + 1);
                    highestRoll = i;
                }
                
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

        for (int i = 0; i < board.length / 2; i++) {
            int[] t = board[i];
            board[i] = board[board.length - 1 - i];
            board[board.length - 1 - i] = t;
        }

        return endCheck(currLocation, endpoint, board, moveCounter);
    }
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
