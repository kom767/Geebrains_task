package Checkmate;
//шахматы
public class Peshka extends Figure {
    public Peshka(int posX, int posY, FigureColor color) {
        super(posX, posY, color);
    }

    @Override
    public String toString() {
        return "P";
    }

    public boolean can(int toX, int toY){
        if(!inBoard(toX, toY)){
            return false;
        }
        int dx = Math.abs(toX - posX);
        int dy = Math.abs(toY - posY);
        return dx == 1 || dy == 1;
    }
}
