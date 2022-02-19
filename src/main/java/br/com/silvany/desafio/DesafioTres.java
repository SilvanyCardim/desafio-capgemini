package br.com.silvany.desafio;

import java.util.Arrays;

public class DesafioTres {
    /**
     * @param input Parametro de entrada
     * @return Quantidade de anagramas encontrados
     */
    public int desafio(String input) {
        int tamAnagrama;
        int cont = 0;
        for (tamAnagrama = 1; tamAnagrama <= input.length() - 1; tamAnagrama++) {
            for (int i = 0; i <= input.length() - tamAnagrama; i++) {
                for (int j = input.length(); j > i + tamAnagrama; j--) {
                    if (anagrama(input.substring(i, i + tamAnagrama), input.substring(j - tamAnagrama, j))) {
//                    System.out.println("compare=" + input.substring(i, i + tamAnagrama) + "<>" + new StringBuilder().append(input.substring(j - tamAnagrama, j)).reverse());
                        cont++;
                        break;
                    }
                }
            }
        }
        return cont;
    }

    /**
     * @param entradaA String para ser comparada no anagrama
     * @param entradaB String para ser comparada no anagrama
     * @return Se as entradas forem anagrama, o retorno será verdadeiro. Caso contrário, falso.
     */
    public boolean anagrama(String entradaA, String entradaB) {
        //Para encontrar o anagrama, a forma que escolhi foi a ordenação do tipo char.
        //caso seja igual pós ordenado, então são anagramas.
        char[] aVetor = entradaA.toCharArray();
        char[] bVetor = entradaB.toCharArray();
        Arrays.sort(aVetor);
        Arrays.sort(bVetor);
        if (Arrays.equals(aVetor, bVetor)) {//Comparando o vetor inteiro
            return true;
        }
        return false;
    }
}
