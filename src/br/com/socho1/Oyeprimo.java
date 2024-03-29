package br.com.socho1;

public class Oyeprimo {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (Primo(i)) {
                System.out.println("Primos e Tios: " +  i);
            }
        }
    }
    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
