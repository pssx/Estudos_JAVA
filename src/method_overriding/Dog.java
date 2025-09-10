package method_overriding;

public class Dog extends Animal {

    @Override // good practices
    void speak(){
        System.out.println("The animal goes *bark* ");
    }


}
