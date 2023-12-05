package tech.ada.nuclea;

public class TestePessoa {

    public static void main(String[] args) {

        // Nova instância de pessoa;
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Rodolfo";
        pessoa.telefone = "999999";

        System.out.println(pessoa.nome);

        pessoa = new Pessoa();
        pessoa.nome = "Luciano";
        pessoa.telefone = "888888";

        System.out.println(pessoa.nome);




        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Helena";
        pessoa2.telefone = "888888888";



    }
}
