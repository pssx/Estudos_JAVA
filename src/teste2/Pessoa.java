package teste2;

public class Pessoa {

    String nome;
    int cpf;

    Endereco endereco;

    public Pessoa(String nome,int cpf,Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;



    }

    void showInfoPessoa(){
        System.out.println(nome);
        System.out.println(cpf);
        endereco.showEndereco();

    }
}
