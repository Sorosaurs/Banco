package br.com.socho1;

public class Conta {

    private int id;
    private double saldo;
    private  int credito;
    private TipoConta tipo;
    private double saldoNegativo;

    public Conta(int id, double saldo, int credito, TipoConta tipo, double saldoNegativo) {
        this.id = id;
        this.saldo = saldo;
        this.credito = credito;
        this.tipo = tipo;
        this.saldoNegativo = saldoNegativo;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCredito() {
        return credito;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public double getSaldoNegativo() {
        return saldoNegativo;
    }
}
