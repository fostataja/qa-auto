package fostataja.test.java01.Easy;

import fostataja.test.java01.Easy.Car;

public class Main {


    public  static void main(String[] args) {
//
//
//        Car nissan = new Car ("Note", 2018);
//        Car opel = new Car("Astra", 2016);
//        Car mazda = new Car();
//
//        mazda.setModel("Mazda model");
//        mazda.setYear(2017);
//
//        System.out.println(mazda.getModel());
//        System.out.println(nissan.getModel());
//        System.out.println(opel.getModel());
//
//        System.out.println(opel.getYear() + nissan.getYear());
//
//
//        System.out.println(mazda.toString());

        Car myCar = new Car();
        myCar.test(1);
        myCar.test("DDD");
        myCar.test(3,4.5);
        myCar.test(new int[]{1,4});

    }
}
