package br.com.socho1;
import br.com.socho1.ClienteFisico;
public class View {
    public static void main(String[] args) {
        ClienteFisico Cleber = new ClienteFisico(1,"Cleber",2002,20002);
        Conta conta = new Conta(1, 1000, 2,Cleber, TipoConta.CONTA_CORRENTE, 0);

        System.out.println(conta.getCliente().getNome());

    }
}

