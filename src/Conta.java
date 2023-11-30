import java.time.LocalDateTime;

public class Conta {

    String nomeTitular;
    Double saldo;
    Double taxaRendimento;
    LocalDateTime dataCriacao;

    Conta() {
        dataCriacao = LocalDateTime.now();
    }

    Conta(String nomeTitular, Double saldo, Double taxaRendimento) {
        dataCriacao = LocalDateTime.now();
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.taxaRendimento = taxaRendimento;
        System.out.println("Criando uma nova instância de conta");
    }

    Double rende() {
        return saldo * taxaRendimento;
    }

}
