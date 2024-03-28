package br.com.socho1;

public class View {
    public static void main(String[] args) {
        Conta conta = new Conta(1, 1000, 2, TipoConta.CONTA_CORRENTE, 0);
        System.out.println(conta.getTipo());
    }
}

