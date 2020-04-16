package Task2;
//задача2
public class Roadrun {
    public static void main(String[] args) {
        Human kamil = new Human("Kamil");
        Cat mursik = new Cat("Mursik");
        Robot amigo = new Robot("Amigo");
        kamil.run(150);
        mursik.run(150);
        amigo.run(150);
    }
}
