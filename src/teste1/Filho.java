package teste1;

public class Filho extends Pai{
    int especialNum;


    public Filho(String name,int idade,int especialNum){
        super(name,idade);
        this.especialNum = especialNum;
    }
    @Override
    public void info_basico(){
        System.out.println(name + " " + idade + " " + especialNum );
    }

    public void info_basico(String z){
        System.out.println("This is overloaded method" + z  );
    }
}
