package Checkmate;
//шахматы
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        chessboard.printBoard();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Введите X, Y, X1, Y1");
            int x = in.nextInt(), y = in.nextInt();
            int x1 = in.nextInt(), y1 = in.nextInt();
            x--; x1--;
            y--; y1--;
            chessboard.move(x, y, x1, y1);
            System.out.println();
            chessboard.printBoard();
        }
    }
}
