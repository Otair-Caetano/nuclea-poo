package tech.ada.nuclea.aula3;

public class TesteAula03 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Rodolfo Ferreira", 100.00);

        conta.deposito(200);
        conta.saque(500.00);

        System.out.println(conta.getNomeTitular());

        conta.setNomeTitular("Rodolfo Ferreira de Lima");

        System.out.println(conta.getNomeTitular());





        ContaBancaria conta2 = new ContaBancaria("Sylas", 100.00);

        System.out.println(conta2.getNomeTitular());

        //System.out.println("Meu saldo é de: " + conta.saldo);
    }
}
