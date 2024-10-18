import java.util.Scanner;



public class GoBoard {
    static String[][] makeBoard = new String [9][9];
    //Scanner here
    static Scanner testIn = new Scanner (System.in);
    static boolean gameState = true;
    static int sideCheck = 0;
    static boolean validMove = false;


    public static void main(String[] args) throws Exception {
        //First while loop for the game to be running
        while (gameState == true){
            System.out.println("  0 1 2 3 4 5 6 7 8");
            //This is working. Prints the board and coord system.
            for (int i = 0; i<makeBoard.length; i++){
                System.out.print(i+ " ");
                for (int j=0; j<makeBoard.length; j++){
                    if (makeBoard [i][j] == null){
                        if (j==0){
                            System.out.print("|");
                        }
                        else {
                            System.out.print("-|");
                        }
                    } else {
                        System.out.print(makeBoard[i][j]);
                    }
                }
                System.out.println();
            }
            //resetting valid move
            validMove = false;
            //Need to announce who's turn it is through the side check.
            if (sideCheck == 0){
                System.out.println("It is Black's Turn!");
            }
            if (sideCheck == 1){
                System.out.println("It is White's Turn!");
            }
            //This will take the input and place it in the array
            //this is a second while loop to check if its a valid move to prevent the board from printing each time an invalid move is made
            while (validMove == false){
                System.out.println("Please select the X coordinate where you would like to place your piece");
                var moveX = testIn.nextInt();
                if (moveX < 9){
                    System.out.println("Your input was : " + moveX);
                }else{
                    //invalid int
                    while (moveX > 9){
                        System.out.println("That is not a valid input! Please select your X input again");
                        moveX=testIn.nextInt();
                    }
                }
                System.out.println("Please select the Y coordinate where you would like to place your piece");
                var moveY = testIn.nextInt();
                if (moveY < 9){
                    System.out.println("Your input was : " + moveY);
                }else{
                    //invalid int
                    while (moveY > 9){
                        System.out.println("That is not a valid input! Please select your Y input again");
                        moveY=testIn.nextInt();
                    }
                }
                //Check to see if its a valid move, which side placed it, and swap players turn.
                if (makeBoard[moveY][moveX] != "-○" && makeBoard[moveX][moveY] != "-●"){
                    if (sideCheck == 0){
                        makeBoard[moveY][moveX] = "-○";
                        sideCheck = 1;
                        validMove = true;
                    }else if(sideCheck == 1){
                            makeBoard[moveY][moveX] = "-●";
                            sideCheck = 0;
                            validMove = true;
                        }
                    
                }else{
                    System.out.println("That is not a valid move! Please try again");
                } 
            }
        }
     //end of loop here.
    }
}
