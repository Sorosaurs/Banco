package br.com.socho1;
import br.com.socho1.ClienteFisico;
public class View {
    public static void main(String[] args) {
        Conta conta = new Conta(1, 1000, 2, TipoConta.CONTA_CORRENTE, 0);

        ClienteFisico Cleber = new ClienteFisico(1,"Cleber",2002,20002);
    }
}

