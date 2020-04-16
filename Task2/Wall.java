package Task2;
//задача2
public class Wall extends Beings {
    public static void main(String[] args) {
        Human kamil = new Human("Kamil");
        Cat mursik = new Cat("Mursik");
        Robot amigo = new Robot("Amigo");
        kamil.jump(1.5);
        mursik.jump(1.5);
        amigo.jump(1.5);
    }
}
