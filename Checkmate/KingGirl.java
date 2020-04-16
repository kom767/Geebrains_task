package Checkmate;
//шахматы
public class KingGirl extends Figure {
    public KingGirl(int posX, int posY, FigureColor color) {
        super(posX, posY, color);
    }

    @Override
    public String toString() {
        return "G";
    }

    public boolean can(int toX, int toY){
        if(!inBoard(toX, toY)){
            return false;
        }
        int dx = Math.abs(toX - posX);
        int dy = Math.abs(toY - posY);
        return (dx == dy) || (dx == 0 || dy == 0);
    }
}
