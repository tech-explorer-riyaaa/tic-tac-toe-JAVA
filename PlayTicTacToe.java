package secondSemPROJECT;
import java.util.Scanner;

public class PlayTicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToe game = new TicTacToe(); // calling the default constructor
        System.out.println("-x-x-x-x-x-x-x-x Let's begin the game!-x-x-x-x-x-x-x-x-x-x");
        game.printBoard();
        
        while (!game.isWinner() && !game.isBoardFull()) { 
            // condiitons to be a winner hasn't satisfied yet and the board is not full yet.
            System.out.println("Current player: " + game.currentPlayer);
            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = sc.nextInt();   
            game.makeMove(row, col);
            if (game.isWinner()) {
                game.printBoard();
                System.out.println("wohoooooooooooooo! we have our winner.");
                System.out.println("Player " + game.currentPlayer + " wins!");
                break;
            }
            game.changePlayer();
            game.printBoard();
            
        }
        
        if (!game.isWinner()) {
        }
        System.out.println("THE END");
        sc.close();
    }
}
    

