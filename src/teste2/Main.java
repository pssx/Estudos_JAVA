package teste2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Santos");
        Pessoa pessoa = new Pessoa("Paulo",112233,endereco);


        pessoa.showInfoPessoa();



    }
}
