import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;  

        do {
            char[][] board = new char[6][7];

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    board[i][j] = '.';
                }
            }

            char player = 'X';
            boolean gameOver = false;

            while (!gameOver) {

                
                System.out.println();
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.print("Player " + player + ", Enter column (1-7): ");
                int col = sc.nextInt() - 1;

                if (col < 0 || col > 6) {
                    System.out.println("Invalid Column!");
                    continue;
                }

                boolean placed = false;

                
                for (int row = 5; row >= 0; row--) {
                    if (board[row][col] == '.') {
                        board[row][col] = player;
                        placed = true;
                        break;
                    }
                }

                if (!placed) {
                    System.out.println("Column Full!");
                    continue;
                }

                
                boolean win = false;

                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (board[i][j] == player &&
                            board[i][j + 1] == player &&
                            board[i][j + 2] == player &&
                            board[i][j + 3] == player)
                            win = true;
                    }
                }

                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (board[i][j] == player &&
                            board[i + 1][j] == player &&
                            board[i + 2][j] == player &&
                            board[i + 3][j] == player)
                            win = true;
                    }
                }

                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (board[i][j] == player &&
                            board[i + 1][j + 1] == player &&
                            board[i + 2][j + 2] == player &&
                            board[i + 3][j + 3] == player)
                            win = true;
                    }
                }

                
                for (int i = 3; i < 6; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (board[i][j] == player &&
                            board[i - 1][j + 1] == player &&
                            board[i - 2][j + 2] == player &&
                            board[i - 3][j + 3] == player)
                            win = true;
                    }
                }

                if (win) {

                    System.out.println();

                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(board[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("Player " + player + " Wins!");
                    gameOver = true;
                    continue;
                }

                
                boolean draw = true;

                for (int j = 0; j < 7; j++) {
                    if (board[0][j] == '.') {
                        draw = false;
                        break;
                    }
                }

                if (draw) {
                    System.out.println("Game Draw!");
                    gameOver = true;
                    continue;
                }

                
                if (player == 'X')
                    player = 'O';
                else
                    player = 'X';
            }

            System.out.print("Play Again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }
}