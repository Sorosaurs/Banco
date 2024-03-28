package br.com.socho1;

public class ClienteFisico extends Cliente{
    private int cpf;

    public ClienteFisico(int id, String nome, int conta, int cpf) {
        super(id, nome, conta);
        this.cpf = cpf;
    }
}
