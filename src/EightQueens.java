package src;

import java.util.Random;
public class EightQueens {
    public static void main(String[] args) {

        Random randomNumber = new Random();

        int [][] chessBoard = new int [8][8];

        int K = 1;
        int count = 0;

        count = 0;

        for(int numb1 = 0; numb1 <=7; numb1++){
            for(int numb2 = 0; numb2 <= 7; numb2++){
                if(chessBoard[numb1][numb2] == 1){
                    break;
                }
                else{
                    numb2 = randomNumber.nextInt(8);
                    int k = 0;
                    for(int a = numb1 + 1; a <= 7; a++){
                        if((a >= 0)&&(a <= 7)){
                            if(chessBoard[a][numb2] == 1){
                                k = 1;
                            }
                        }
                    }
                    for(int b = numb2 + 1; b <= 7; b++){
                        if((b >= 0)&&(b <= 7)){
                            if(chessBoard[numb1][b] == 1){
                                k = 1;
                            }
                        }
                    }
                    for(int a = numb1 - 1; a >= 0; --a){
                        if((a >= 0)&&(a <= 7)){
                            if(chessBoard[a][numb2] == 1){
                                k = 1;
                            }
                        }
                    }
                    for(int b = numb2 - 1; b >= 0; --b){
                        if((b >= 0)&&(b <= 7)){
                            if(chessBoard[numb1][b] == 1){
                                k = 1;
                            }
                        }
                    }
                    for(int a = numb1 + 1, b = numb2 + 1; b <= 7; a++, b++){
                        if((a >= 0)&&(a <= 7)){
                            if((b >= 0)&&(b <= 7)){
                                if(chessBoard[a][b] == 1){
                                    k = 1;
                                }
                            }
                        }
                    }
                    for(int a = numb1 - 1, b = numb2 - 1; b >= 0; --a, --b){
                        if((a >= 0)&&(a <= 7)){
                            if((b >= 0)&&(b <= 7)){
                                if(chessBoard[a][b] == 1){
                                    k = 1;
                                }
                            }
                        }
                    }
                    for(int a = numb1 + 1, b = numb2 - 1; b >= 0; a++, --b){
                        if((a >= 0)&&(a <= 7)){
                            if((b >= 0)&&(b <= 7)){
                                if(chessBoard[a][b] == 1){
                                    k = 1;
                                }
                            }
                        }
                    }
                    for(int a = numb1 - 1, b = numb2 + 1; a >= 0; --a, b++){
                        if((a >= 0)&&(a <= 7)){
                            if((b >= 0)&&(b <= 7)){
                                if(chessBoard[a][b] == 1){
                                    k = 1;
                                }
                            }
                        }
                    }
                    if( k == 1)
                        k = 0;
                    else{
                        chessBoard[numb1][numb2] = K;
                    }
                }
            }

        }

        for (int row = 0; row < chessBoard.length; row++){
            for(int column = 0; column < chessBoard[row].length; column++){
                System.out.printf("%2d", chessBoard[row][column]);
            }
            System.out.println();
        }

        for (int row = 0; row < chessBoard.length; row++){
            for(int column = 0; column < chessBoard[row].length; column++) {
                if (chessBoard[row][column] == 1) {
                    ++count;
                }
            }
        }

        System.out.println(count);
    }
}
