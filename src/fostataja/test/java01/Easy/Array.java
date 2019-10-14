package fostataja.test.java01.Easy;

public class Array {
    public static void main (String [] args){

        int [][] multiTable = new int [6][6];

        for (int l = 3; l < 6; l++){
            for (int j = 12; j >6; j--){
                multiTable[l][j] = l*j;
            }
            System.out.println('*');
        }
}}
