package Task2;

public class Prepyatstvia {
    public static void main(String[] args) {
        Beings [] array = new Beings[3];
        array[0] = new Human("Ваня");
        array[1] = new Cat("Васька");
        array[2] = new Robot("Бойскаут");

        for (Beings beings : array){
            beings.run(200);
            beings.jump(2.0);
        }
    }
}
