package br.com.silvany.desafio;

public class DesafioDois {

    /**
     * @param input Parametro de entrada
     * @return Quantidade de caracteres que necessita adicionar para deixar a senha forte.
     */
    public int desafio(String input) {
        String simbolos = "!@#$%^&*()-+"; //conjunto de caracteres especiais para comparação
        //Para subtrair ao final, iniciamos em 1 e caso encontremos o que procuramos,
        // setamos em 0 para não precisar subtrair
        int achouNumero = 1;
        int achouMaiuscula = 1;
        int achouMinuscula = 1;
        int achouSimbolo = 1;
        char[] senhaQuebrada = input.toCharArray();
        for (char c : senhaQuebrada) { //para cada caractere da senha, verificar se contem o requisito.
            if (Character.isDigit(c)) {
                achouNumero = 0;
            } else if (Character.UPPERCASE_LETTER == Character.getType(c)) {
                achouMaiuscula = 0;
            } else if (Character.LOWERCASE_LETTER == Character.getType(c)) {
                achouMinuscula = 0;
            } else if (simbolos.contains(String.valueOf(c))) {
                achouSimbolo = 0;
            }
        }
        //o retorno deve ser o maior entre caracteres que faltam para alcançar 6
        // e o que falta de caracteres específicos
        return (Math.max(6 - senhaQuebrada.length, (achouNumero + achouMaiuscula + achouMinuscula + achouSimbolo)));
    }
}
