package Aulas;

public class Aula05OperadoresAritmeticos {
    public static void main(String[] args) {
        // Tipos de Operadores (Básicos) = + - / *
        int numero01 = 10;
        int numero02 = 30;


        // Soma
        int soma = numero01 + numero02;
        // Imprimindo resultado da Soma
        System.out.println(soma);

        // Subtração
        int subtracaoNegativa = numero01 - numero02;
        int subtracaoPositiva = numero02 - numero01;
        // Imprimindo as Subtrações
        System.out.println(subtracaoNegativa);
        System.out.println(subtracaoPositiva);

        // Divisão (Versão Feia)
        float divisaoFeia = (float) numero01 / (float) numero02;
        // Imprimindo Divisão Feia
        System.out.println(divisaoFeia);

        // Divisão (Versão Limpa)
        float numeroDivisão01 = 10;
        float numeroDiviao02 = 30;
        float divisaoLimpa01 = numeroDiviao02 / numeroDivisão01;
        float divisaoLimpa02 = numeroDivisão01 / numeroDiviao02;
        // Imprimindo Divisão Bonita
        System.out.println(divisaoLimpa01);
        System.out.println(divisaoLimpa02);

        // Multiplicação
        int multiplicacao = numero01 * numero02;
        // Imprimindo Multiplicação
        System.out.println(multiplicacao);
    }
}
