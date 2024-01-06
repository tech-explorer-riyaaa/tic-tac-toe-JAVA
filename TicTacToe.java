package secondSemPROJECT;
public class TicTacToe {
    private char[][] board; //2D array to present the board
    char currentPlayer;
    
    public TicTacToe() { //default constructor to create the board
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }
    
    public void initializeBoard() { //method to initialize the empty board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    
    public void printBoard() {//method to print the board
        int row = 0;
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(row+" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            row++;
        }
    }
    
    public boolean isBoardFull() { //to check if any cell is still left
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isWinner() { //to check whether the currentPlayer won or not (after making their move)
        // Checking rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        
        // Checking columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        
        // Checking diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        
        return false;
    }
    
    public void makeMove(int row, int col) { //scenario while making a move
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer; //placing current player at the desired cell
        } else {
            System.out.println("Wrong move! you missed your chance"); //to handle wrong inputs
        }
    }

    public void changePlayer(){
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // changing the current player
    }
}
