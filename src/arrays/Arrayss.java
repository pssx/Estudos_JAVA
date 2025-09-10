package arrays;
import java.util.*;


public class Arrayss {
    public static void main(String[] args) {

        //String[] cars = {"Camaro","Corvette","Tesla","BMW"};
        //cars[0] = "Mustang";
        //System.out.println(cars[0]);
        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);


        }

        int[] nums= { 2, 3, 5, 7, 11, 13, 18, 34};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0){
                System.out.println(nums[i]);
            }


        }



    }
}
