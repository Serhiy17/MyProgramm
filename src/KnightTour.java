package src;
import java.util.Random;

public class KnightTour {

    public static void main(String[] args) {

        Random randomNumbers = new Random();

        int [][]chessBoard = new int [8][8];

        int [] horiz = {2, 1, -1, -2, -2, -1, 1, 2};
        int [] vert = {-1, -2, -2, -1, 1, 2, 2, 1};

        System.out.println();
        int K = 1;//number of K

        int currentRow = 0;
        int currentColumn = 0;

        for (int row = 0; row < chessBoard.length; row++){
            for(int column = 0; column < chessBoard[row].length; column++){
                System.out.printf("%2d", chessBoard[row][column]);
            }
            System.out.println();
        }
        System.out.println();

        chessBoard[currentRow][currentColumn] = K;

        for(currentRow = 0; currentRow <= 7; currentRow++){
            for(currentColumn = 0; currentColumn <= 7; currentColumn++){
                if(chessBoard[currentRow][currentColumn] == 0){

                    for( int i = 0; i < 64; i++){
                        int moveNumber = randomNumbers.nextInt(8);
                        currentRow += vert[moveNumber];
                        currentColumn += horiz[moveNumber];
                        if((currentRow >= 0)&(currentRow <= 7)) {
                            if ((currentColumn >= 0)&(currentColumn <= 7)) {
                                if(chessBoard[currentRow][currentColumn] == 0){
                                    chessBoard[currentRow][currentColumn] = K;
                                }
                            }
                            else {
                                currentRow -= vert[moveNumber];
                                currentColumn -= horiz[moveNumber];
                            }
                        }
                        else {
                            currentRow -= vert[moveNumber];
                            currentColumn -= horiz[moveNumber];
                        }
                    }
                }
            }
        }

        if((currentRow == 0)&&(currentColumn == 0)){
            for (int row = currentRow; row < chessBoard.length; row++){
                for(int column = currentColumn; column < chessBoard[row].length; column++){
                    System.out.printf("%2d", chessBoard[row][column]);
                }
                System.out.println();
            }
        }
        else
            for (int row = 0; row < chessBoard.length; row++){
                for(int column = 0; column < chessBoard[row].length; column++){
                    System.out.printf("%2d", chessBoard[row][column]);
                }
                System.out.println();
            }
    }
}

