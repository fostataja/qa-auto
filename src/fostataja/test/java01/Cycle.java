package fostataja.test.java01;

public class Cycle {

    public static void main (String [] args){

        for (int i = 0; i < 20; i++){
            System.out.println(i);
        }

        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        for (int l = 3; l < 6; l++){
            for (int j = 12; j >6; j--){
                System.out.print(l*j + " ");
            }
            System.out.println('*');
        }


    }
}
