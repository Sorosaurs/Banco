package br.com.socho1;

public class ClienteJuridico extends Cliente{
    private int cnpj;
    public ClienteJuridico(int id, String nome, int conta, int cnpj) {
        super(id, nome, conta);
        this.cnpj = cnpj;
    }
}
