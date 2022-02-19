package br.com.silvany.desafio;

public class DesafioUm {
    public void desafio(String input) {
        //converter de String para inteiro
        int n = Integer.valueOf(input);
        //Fazendo de 1 até n
        for (int i = 1; i <= n; i++) {
            // vamos imprimir espaço em branco de 1 até n
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //vamos imprimir o restante de n até i com *
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // quebra de linha
            System.out.println("");
        }
    }
}
