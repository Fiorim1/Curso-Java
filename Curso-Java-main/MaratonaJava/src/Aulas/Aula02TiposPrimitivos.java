
package Aulas;

public class Aula02TiposPrimitivos {

    // Tipos Primitivos

    public static void main (String[] args) {

        // São tipos que vão guardar em memória um valor simples

        // int, double, float, char, byte, short, long e boolean

        // Criar Variável = Tipo + Nome = Valor
        int idade = 20;

        double salarioDouble = 2000.063D;

        float salarioFloat = 2500.085f;

        byte idadeByte = 10;

        short idadeShort = 10;

        boolean verdadeiro = true;

        boolean falso = false;

        long numeroGrande = 100000L;

        // Usar aspas simples ''
        char caracter = 'A';

        // Trabalhar com Unicode
        char uniCode = '\u0041';

        // Imprimindo a variável "age"
        System.out.println("A idade é " + idade  + " anos.");

        // Impressão dos Tipos Primitivos
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(numeroGrande);
        System.out.println(caracter);
        System.out.println(uniCode);

        // Fazer um CASTING (casting ele converte para o tipo primitivo solicitado pelo dev)
        int idadeCasting = (int) 1000000000L;
        // Imprimir o casting
        System.out.println(idadeCasting);
    }
}