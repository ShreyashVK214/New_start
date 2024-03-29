public class nqueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        //we are starting the function by giving board to the fucntion queen and starting row from zero
        queens(board, 0);
    }

    static void queens(boolean[][] board, int row) {
        // this is base condition for recursive function
        if (row == board.length) {
            display(board);
            System.out.println();
            return;
        }

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe      (board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1);
                // board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col)
        ;
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }
// this function is there to display the results 
//  its a void function because this diplays the actual representation of the chess board after queen placement
    private static void display(boolean[][] board) {
        // it takes the 2d array as input
        for (boolean[] row : board) {
            // for every row of the board 
            for (boolean element : row) {
                // for every element of that row 
                if (element) {
                    System.out.print("Q ");
                } else {                                                                        
                    System.out.print("X ");
                }
            }
            //  after every row completion we print the results on next line 
            System.out.println();
        }
    }
}
