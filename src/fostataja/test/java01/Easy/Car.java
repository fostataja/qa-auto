package fostataja.test.java01.Easy;

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
    public void setYear(int year) {

        this.year = year;
    }

    public Car (){

    }

    public String getModel (){
        return this.model;


    }

    public  int getYear (){
        return this.year;


    }

    public String toString(){
        return this.model + ", " + this.year;
    }


    public void test(String s){
        s = "abcd";
        System.out.println("test(String s)");
    }

    public void test(int i){
        System.out.println("test(int i)");
    }

    public void test(int []arr){
        System.out.println("test(int[] arr");
    }

    public int test(int i, double f){
        System.out.println("test(int i, double f)");
        return i+10;
    }

}
