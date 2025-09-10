package static_keyword;

public class Main {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method id created and shared.
        //          The class "owns" the static member

        Friend friend = new Friend("Paulo");
        Friend friend2 = new Friend("Max");

        //System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();


    }
}
