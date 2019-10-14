package fostataja.test.java01.Inheritance;

import fostataja.test.java01.Inheritance.Animal;

public class Dog extends Animal implements Jumpable {



    public Dog (int height, String color){
        super(height, color);
       setMessage("Bau");
    }


    @Override
    public void makeAJump() {
        System.out.println("Jump!");
    }
}
