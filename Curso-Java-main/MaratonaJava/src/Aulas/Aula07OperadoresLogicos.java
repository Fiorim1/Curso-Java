package Aulas;

public class Aula07OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores Lógicos retornam valores booleanos (verdadeiro - True e falso - False)
        // Operadores Lógicos = < > <= >= == !=

        boolean isDezMenorQueVinte = 10 < 20;
        // Imprimindo para ver se 10 é menor que 20
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        boolean isTrintaMaiorQueCem = 30 > 100;
        System.out.println("isTrintaMaiorQueCem " + isTrintaMaiorQueCem);

        boolean isQuarentaMaiorOuIgualACinquenta = 40 >= 50;
        // Imprimindo para ver se 40 é maior ou igual a 50
        System.out.println(isQuarentaMaiorOuIgualACinquenta);

        boolean isDezMenorOuIgualAVinte = 10 <= 20;
        System.out.println(isDezMenorOuIgualAVinte);

        boolean igual = 20 == 20.00;
        // Imprimindo para ver se 20 é igual a 20.00
        System.out.println(igual);

        boolean diferente = 20 != 20.0001;
        System.out.println(diferente);

    }
}
