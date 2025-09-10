package if_statements;

public class If_statements {
    public static void main(String[] args) {
        int age = 75;

        if (age == 75) {
            System.out.println("z");
        } else if (age >= 18) {
            System.out.println("x");
        } else {
            System.out.println("s");
        }


        // Ternary Operator Example
        // booleanExpression ? expression1 : expression2
        // if booleanExpression is true, then the value of the whole expression is the value of expression1

        int num = 3;
        final String msg = num > 10 ? "Number is greater than 10" : "Number is less than or equal to 10";
        System.out.println(msg);

    }
}

