package fostataja.test.java01.Inheritance;

import fostataja.test.java01.Inheritance.Animal;

public class Cat extends Animal {

    public Cat (int height, String color) {
        super(height,color);
        setMessage("Mau");
    }

    public int getHeight() {
        System.out.println("Set height in Cat");
        return super.getHeight() + 1;
    }

//    @Override
//    public String toString(){
//        return super.toString() + "Prrrr";
//    }
}
