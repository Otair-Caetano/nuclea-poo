package tech.ada.nuclea;

public class TesteConta {

    public static void main(String[] args) {
        // TIPO
        Conta conta = new Conta();

        System.out.println(conta.nomeTitular);
        System.out.println(conta.saldo);
        System.out.println(conta.taxaRendimento);

        Double valorRendimento = conta.rende();

        System.out.println(conta.dataCriacao);
        System.out.println(valorRendimento);
    }
}
