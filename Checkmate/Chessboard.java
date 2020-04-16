package Checkmate;
//шахматы
public class Chessboard {
    private Figure [][] board;

    public Chessboard(){
        board = new Figure[8][8];
        //Расстановка фигур на доску
        board[0][0] = new Rook(0, 0, FigureColor.BLACK);
        board[0][1] = new Knight(0, 1, FigureColor.BLACK);
        board[0][2] = new Elephant(0, 2, FigureColor.BLACK);
        board[0][3] = new KingGirl(0, 3, FigureColor.BLACK);
        board[0][4] = new KingBoy(0, 4, FigureColor.BLACK);
        board[0][5] = new Elephant(0, 5, FigureColor.BLACK);
        board[0][6] = new Knight(0, 6, FigureColor.BLACK);
        board[0][7] = new Rook(0, 7, FigureColor.BLACK);
        board[1][0] = new Peshka(1, 0, FigureColor.BLACK);
        board[1][1] = new Peshka(1, 1, FigureColor.BLACK);
        board[1][2] = new Peshka(1, 2, FigureColor.BLACK);
        board[1][3] = new Peshka(1, 3, FigureColor.BLACK);
        board[1][4] = new Peshka(1, 4, FigureColor.BLACK);
        board[1][5] = new Peshka(1, 5, FigureColor.BLACK);
        board[1][6] = new Peshka(1, 6, FigureColor.BLACK);
        board[1][7] = new Peshka(1, 7, FigureColor.BLACK);
        board[6][0] = new Peshka(7, 0, FigureColor.WHITE);
        board[6][1] = new Peshka(7, 1, FigureColor.WHITE);
        board[6][2] = new Peshka(7, 2, FigureColor.WHITE);
        board[6][3] = new Peshka(7, 3, FigureColor.WHITE);
        board[6][4] = new Peshka(7, 4, FigureColor.WHITE);
        board[6][5] = new Peshka(7, 5, FigureColor.WHITE);
        board[6][6] = new Peshka(7, 6, FigureColor.WHITE);
        board[6][7] = new Peshka(7, 7, FigureColor.WHITE);
        board[7][0] = new Rook(7, 0, FigureColor.WHITE);
        board[7][1] = new Knight(7, 1, FigureColor.WHITE);
        board[7][2] = new Elephant(7, 2, FigureColor.WHITE);
        board[7][3] = new KingGirl(7, 3, FigureColor.WHITE);
        board[7][4] = new KingBoy(7, 4, FigureColor.WHITE);
        board[7][5] = new Elephant(7, 5, FigureColor.WHITE);
        board[7][6] = new Knight(7, 6, FigureColor.WHITE);
        board[7][7] = new Rook(7, 7, FigureColor.WHITE);
    }
    private String strValue(Figure figure){
        return figure == null ? "_" : figure.toString();
    }

    public void printBoard(){
        for (int i = 0; i < 9 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(strValue(board[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void move(int fromX, int fromY, int toX, int toY){
        if (board[fromX][fromY].can(toX, toY)){
            Figure tm = board[fromX][fromY];
            board[fromX][fromY] = null;
            board[toX][toY] = tm;
            tm.move(toX, toY);
        } else {
            System.out.println("Ход невозможен!");
        }
    }
}
