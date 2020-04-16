package Checkmate;

public class Knight extends Figure {
    public Knight(int posX, int posY, FigureColor color) {
        super(posX, posY, color);
    }

    public String toString(){
        return "K";
    }

    public boolean can(int toX, int toY){
        if (!inBoard(toX, toY)){
            return false;
        }
        int dx = Math.abs(toX - posX);
        int dy = Math.abs(toY - posY);
        if (dx * dx + dy * dy == 5){
            return true;
        } else {
            return false;
        }
    }
}
