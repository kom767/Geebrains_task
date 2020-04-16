package Checkmate;
//шахматы
public class Elephant extends Figure {
    public Elephant(int posX, int posY, FigureColor color) {
        super(posX, posY, color);
    }

    @Override
    public String toString() {
        return "E";
    }

    @Override
    public boolean can(int toX, int toY) {
        if (!inBoard(toX, toY)) {
            return false;
        }
        int dx = Math.abs(toX - posX);
        int dy = Math.abs(toY - posY);
        return dx == dy;
    }
}
