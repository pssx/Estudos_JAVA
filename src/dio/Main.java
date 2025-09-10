package dio;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {/*
        // Ctrl + Shift + / = comment

        Scanner leitor = new Scanner(System.in);
        double preco=0;

        for (int i = 0; i <= 1; i++) {
            int cod1 = leitor.nextInt();
            int n1 = leitor.nextInt();
            double valor1 = leitor.nextDouble();
            preco += n1 * valor1;

        }
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", preco));*/

 /*       int num = Integer.parseInt(new Scanner(System.in).nextLine());
        //int num = 14;
        int x = 0;
        while (num > 0){
            x++;
            if (num % 2 == 0) {
                //System.out.println("PAR");
                num = num/ 2;
                System.out.println(num);
            } else {
                num = num -1;
                //System.out.println("IMPAR");
                System.out.println(num);
            }
        }
        System.out.println(x);
*/
        //
        /*String movimentos = new Scanner(System.in).nextLine();
        int x = 0;
        int y = 0;

        for (int i = 0; i < movimentos.length(); i++) {
            if (movimentos.charAt(i) == 'W') {
                y++;
            } else if (movimentos.charAt(i) == 'S') {
                y--;
            } else if (movimentos.charAt(i) == 'D') {
                x++;
            } else if (movimentos.charAt(i) == 'A') {
                x--;
            }
        }
        if (x == 0 && y == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/

        //
        int num = 30;
        int listNum1 [] = new int[num];

        for (int i = 0; i < num; i++) {
            listNum1[i] = i+1;
            System.out.println(listNum1[i]);

        }

        ArrayList<Integer> listNum2 = new ArrayList<Integer>();
        for (int i = 0; i < listNum1.length; i++) {
            System.out.println(listNum1[i]);




        }


    }

}
