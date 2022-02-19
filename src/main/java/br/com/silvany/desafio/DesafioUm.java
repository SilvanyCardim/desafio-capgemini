package br.com.silvany.desafio;

public class DesafioUm {
    public void desafio(String input) {
        int n = Integer.valueOf(input);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
