package br.com.socho1;

public enum TipoConta {
    CONTA_CORRENTE('P'), POUPANCA('P'), CONTA_ESPOLIO('E'), CONTA_;

    private char tipo;
    TipoConta(){
    this.tipo = tipo;
    }
    TipoConta(char tipo) {
        this.tipo = tipo;
    }
    public char getTipo() {
        return tipo;
    }

}
