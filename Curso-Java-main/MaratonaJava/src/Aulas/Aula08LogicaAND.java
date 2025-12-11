package Aulas;

public class Aula08LogicaAND {
    public static void main(String[] args) {
        // Operadores Lógicos: e (&&)
        // Sempre retorna valores booleanos os operadores lógicos


        // Fazendo a comparação com e/and (&&)
        int idade = 20;

        float salario = 3000f;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4600;

        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3500;

        // Imprimindo (necessita que TODAS SEJAM VERDADEIRAS)
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        System.out.println(isDentroDaLeiMenorQueTrinta);
    }
}
