import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //zz();

        int numIpunt = 4;
        int fatorial = 1;
        for (int i = 1; i <= numIpunt ; i++) {
            fatorial = fatorial *i;
            System.out.println(fatorial);
        }

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("nome ?");
//        String name = scanner.nextLine();
//        System.out.println("idade ?");
//        int idade = scanner.nextInt();
//        System.out.println("nome: " + name);
//        System.out.println("idade: " + idade);

        Random random = new Random();
        //int x = random.nextInt(6);
        //double y = random.nextDouble();
        boolean z = random.nextBoolean();
        System.out.println("random "+ z);


//        String x = "Max";
//        String y = "ziin";
//        String temp;
//        temp = x;
//        x=y;
//        y=temp;
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);





    }
    //public static void zz(){System.out.println("dfgdfgdfg");}
}