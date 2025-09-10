package overloaded_constructors;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String toppíng;


    public Pizza() {
    }

    public Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;

    }

    public Pizza(String bread,String sauce,String cheese,String toppíng) {
         this.bread = bread;
         this.sauce = sauce;
         this.cheese = cheese;
         this.toppíng = toppíng;

    }
}
