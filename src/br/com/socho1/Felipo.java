package br.com.socho1;

public class Felipo {
    public static void main(String[] args) {
        int max= 1000;
        int x= 0, y= 1;

        System.out.println("Felipino " + max + ":");

        while (x <= max) {
            System.out.print(x + " ");
            int Adicao = x + y;
            x = y;
            y = Adicao;
        }
    }
}

