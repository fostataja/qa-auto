package fostataja.test.java01.maven;


import fostataja.test.java01.RandomGenerator;

public class RandomTest {

    public static void main(String[] args) {
        RandomGenerator rg = new RandomGenerator();
        System.out.println(rg.getRandom());
    }
}
