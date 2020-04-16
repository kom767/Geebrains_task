package Checkmate;
//шахматы
public class KingBoy extends Figure {
    public KingBoy(int posX, int posY, FigureColor color) {
        super(posX, posY, color);
    }

    @Override
    public String toString() {
        return "B";
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
