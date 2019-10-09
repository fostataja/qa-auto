package fostataja.test.java01;

public class Car {
    public String model;
    private int maxSpeed;
    private  int year;
    private  int speed;

    public Car (String model, int year) {
        this.model = model;
        this.year = year;
    }

    public int getMaxSpeed (){
        return maxSpeed;
    }

    public int getSpeed(){
        return speed;
    }

    public void setModel (String model){
        this.model = model;

    }

    public Car (){

    }
}
