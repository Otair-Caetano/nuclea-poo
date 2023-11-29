import java.time.LocalDate;
import java.util.Scanner;
public class Aula01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe três nomes e telefones: ");

        Pessoa[] pessoas = new Pessoa[3];

        for(int i = 0; i < pessoas.length; i++) {
            System.out.println("Informe o "  +( i + 1 ) + " nome: ");
            Pessoa pessoa = new Pessoa();
            pessoa.nome = scanner.nextLine();

            System.out.println("Informe o "  +( i + 1 ) + " telefone: ");
            pessoa.telefone = scanner.nextLine();

            pessoas[i] = pessoa;
        }

        for(Pessoa pessoa: pessoas) {
            System.out.println("========================");
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("Telefone: " + pessoa.telefone);
            System.out.println("========================");

        }


    }

}
