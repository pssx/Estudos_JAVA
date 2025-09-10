package logical_operators;

import java.util.Scanner;

public class Logical_operators {
    public static void main(String[] args) {
        // logical operators = used to connect two or more expressions
        //   && = (AND) both conditions must be true
        //   || = (OR) either condition must be true
        //    ! = (NOT) reverses boolean value of a condition aa

        Scanner scanner = new Scanner(System.in);
        System.out.println(" you are playing a game ! Press q or Q");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")){
            System.out.println("still playing ");
        }else {
            System.out.println("you quit the game");
        }


    }
}
