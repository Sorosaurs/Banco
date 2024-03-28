package br.com.socho1;

public class Cliente {
    private int id;
    private String nome;
    private int conta;

    public Cliente(int id, String nome, int conta) {
        this.id = id;
        if (id <= 0) {
            throw new IllegalArgumentException("O id inserido é invalido");
        }
        this.nome = nome;
        if (nome == "" || nome == null) {
            throw new IllegalArgumentException("O nome inserido é invalido");
        }
        this.conta = conta;
        if (conta <= 0) {
            throw new IllegalArgumentException("O Conta inserido é invalido");
        }
    }
}