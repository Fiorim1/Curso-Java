package Aulas;

public class Aula09LogicaOR {
    public static void main(String[] args) {
        // Operadores Lógicos: ou (||)
        // Sempre retorna valores booleanos os operadores lógicos

        float valorTotalContaCorrente = 200f;
        float valorContaPoupanca = 10000f;
        float valorPlastation = 5000f;
        // Pelo menos uma das condições TEM QUE SER VERDADEIRAS
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlastation || valorContaPoupanca > valorPlastation;
        String compravel = "É possível comprar o Plastation 5? ";
        System.out.println(compravel + isPlaystationCincoCompravel);
    }
}
