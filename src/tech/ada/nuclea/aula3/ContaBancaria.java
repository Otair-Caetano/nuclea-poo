package tech.ada.nuclea.aula3;

public class ContaBancaria {

    private String nomeTitular;

    private double saldo;

    ContaBancaria() {}

    //default - PACKAGE PRIVATE - basicamente acessível do mesmo pacote
    //public - acessível de qualquer outra pacote, em qualquer outra classe.
    //private - acessível somente para a própria classe
    //protected - acessível no mesmo pacote e para subclasses.

    public ContaBancaria(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void deposito(double valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println("O seu atual é de : " + this.saldo);
    }

    public void saque(double valorSaque) {
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
            System.out.println("O seu saldo atual é de: " + this.saldo);
        } else {
            System.err.println("Saldo insuficiente para o saque de " + valorSaque);
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
