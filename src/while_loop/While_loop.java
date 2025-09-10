package while_loop;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

        }
        System.out.println("Hello");

        System.out.println("Test 2");

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

        }while (name.isEmpty());
        System.out.println("Hello 2");

    }
}
