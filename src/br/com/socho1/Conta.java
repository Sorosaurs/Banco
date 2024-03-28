package br.com.socho1;

public class Conta {

    private int id;
    private double saldo;
    private  int dependente;
    private  Cliente cliente;
    private TipoConta tipo;
    private double saldoNegativo;

    public Conta(int id, double saldo, int dependente, Cliente cliente, TipoConta tipo, double saldoNegativo) {
        this.id = id;
        this.saldo = saldo;
        this.dependente = dependente;
        this.cliente = cliente;
        this.tipo = tipo;
        this.saldoNegativo = saldoNegativo;
    }


    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }


    public double getSaldoNegativo() {
        return saldoNegativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public void setSaldoNegativo(double saldoNegativo) {
        this.saldoNegativo = saldoNegativo;
    }

    private void sacar(double valor){
        System.out.print("Valor retirado: " + valor + " Da conta de: " + this.getId());
        valor = this.getSaldo() - saldo;
        this.setSaldo(valor);
        System.out.println("Valor total em conta de: " + this.getSaldo());
    };
    private void depositar(double valor){;
    };
    private void emprestimo(double valor){;
    };

    public Cliente getCliente() {
        return cliente;
    }


}
