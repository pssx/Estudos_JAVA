package String_methods;

public class String_methods {
    public static void main(String[] args) {
        // String = a reference data type that can store one or more characters
        // reference data type have access to useful methods

        String name = "Bro";

        //boolean result = name.contentEquals("bro");
        //boolean result = name.equals("bro");

        //int  result = name.length();

        //char  result = name.charAt(0);
        //int  result = name.indexOf("B");

        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim(); //remove space
        String result = name.replace("o", "a");



        System.out.println(result);

    }

}
