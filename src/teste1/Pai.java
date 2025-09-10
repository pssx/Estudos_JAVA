package teste1;

public class Pai {
    String name;
    int idade;



    public Pai(String name,int idade){
        this.name = name;
        this.idade = idade;
    }

    public Pai(String name){
        this.name = name;

    }

    public void info_basico(){
        System.out.println(name + " " + idade);
    }

    public void responsabilidade(){
        System.out.println("fazer certo");
    }
}
