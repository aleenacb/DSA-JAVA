import java.util.Scanner;
public class Tictactoe {
        static String[] board;
        static String turn;
        //CheckWinner method will decide the combination of three box given below
        static String CheckWinner()
        {
            for (int a = 0; a < 8; a ++) {
                String line = null;
                switch(a) {
                    case 0 :
                    line = board[0] + board[1] + board[2];
                    break;
                    case 1 :
                    line = board[3] + board[4] + board[5];
                    break;
                    case 2 :
                    line = board[6] + board[7] + board[8];
                    break;
                    case 3 :
                    line = board[0] + board[3] + board[6];
                    break;
                    case 4 :
                    line = board[1] + board[4] + board[7];
                    break;
                    case 5 :
                    line = board[2] + board[5] + board[8];
                    break;
                    case 6 :
                    line = board[0] + board[4] + board[8];
                    break;
                    case 7 :
                    line = board[2] + board[4] + board[6];
                    break;
                    //For x Winner
                    if (line.equals("XXX")) {
                        return "X";
                    }
                    //For O winner 
                    else if (line.equals("OOO")) {
                        return "O";
                    }
                }
                //To enter x or O at the exact place on board
                System.out.println (turn + " ' s turn enter a slot number to place " + turn + " in: ");
                return null;
            } 
            //To print out the board
            /* |---|---|---|
                | 1 | 2 | 3 |
                |-----------|
                | 4 | 5 | 6 |
                |-----------|
                | 7 | 8 | 9 |
                |---|---|---|*/
                static void printBoard() {
                    System.out.println("|---|---|---|");
                    System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
                    System.out.println("|-----------|");
                    System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
                    System.out.println("|-----------|");
                    System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
                    System.out.println("|-----------|");
                }
                public static void main(String[] args) 
                {
                    Scanner in = new Scanner(System.in);
                    board = new String[9];
                    turn = "X";
                    String winner = null;
                    for (int a = 0; a < 9; a++) {
                    board[a] = String.valueOf(a + 1);
                    }
                    System.out.println("Welcome to 3*3 Tic Tac Toe. ");
                    printBoard();
                    System.out.println("X will play first. Enter a slot number to place X in: ");
                    While (winner == null) {
                        int numInput;
                        //Exception handling 
                        //numInput will take input from user like from 1 to 9.
                        //if it is not in range from 1 to 9
                        //then it will show you an error "Invalid input".
                        try {
                            numInput = in.nextInt();
                            if (!(numInput > 0 && numInput <= 9)) {
                                System.out.println("Invalid input; re-enter sloat number : ");
                                continue;
                            }
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Invalid input; re-enter slot number: ");
                            continue;
                        }
                        //This game has two player
                        if (board[numInput - 1].equals(String.valueOf(numInput))) {
                            board[numInput - 1] = turn;
                            if (turn.equals("X")) {
                                turn = "O";
                            }
                            else {
                                turn = "X";
                            }
                            printBoard();
                            winner = CheckWinner();
                        }
                        else {
                            System.out.println("Slot already taken; re-enter slot number: ");
                        }
                    }
                    //If no win or lose from both player x and o.
                    //then there is the logic to print "draw"
                    if (winner.equalsIgnoreCase("draw")) {
                        System.out.println("It's a draw! Thanks for playing.");
                    }
                    //For winner to display Congratulations! message
                    else {
                        System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
                    }
                    in.close();
                }

        }
}    

