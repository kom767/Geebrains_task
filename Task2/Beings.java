package Task2;

public abstract class Beings {
    protected String name;

    protected int runLimit;
    protected double jumpLimit;

    public Beings(){
        this.name = "Без имени";
    }
    public Beings(String name){
        this.name = name;
    }
    public void run(int distance){
        if(runLimit > 0 && distance <= runLimit){
            System.out.println(this.name + " пробежал " + distance + " метров!");
        }
        else{
            System.out.println(this.name + " столько не пробежит!!!");
        }
    }
    public void jump(double height){
        if(jumpLimit > 0 && height <= jumpLimit){
            System.out.println(this.name + " прыгнул " + height + " метров!");
        }
        else {
            System.out.println(this.name + " столько прыгнуть не сможет!!!");
        }
    }
}
