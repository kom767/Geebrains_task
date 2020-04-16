package Task2;
//задача2
public class Robot extends Beings {
    public Robot(String name){
        super(name);
        runLimit = 1000;
    }

    public void jump(double height){
        System.out.println("Робот " + name + " не умеет прыгать!");
    }
}
