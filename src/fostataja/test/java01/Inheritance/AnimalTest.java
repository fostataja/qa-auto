package fostataja.test.java01.Inheritance;

public class AnimalTest {

    public static void main(String[] args){
        Dog shepherd = new Dog(50,"Brown");
        Cat persian = new Cat(20, "Smokey");
        System.out.println(shepherd.say());
        System.out.println(persian.say());

        shepherd.getHeight();
        persian.getHeight();

        shepherd.makeAJump();
    }
}
