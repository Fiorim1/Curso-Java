package Exercicios;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>,
 na data <data>
 */

public class Aula04TiposPrimitivosExercicio {
    public static void main(String[] args) {
        // Criando as variáveis
        String nome = "Gabriel";
        String endereco = "Av. Paulista, 62 - São Paulo / SP";
        float salario = 3500.50f;
        String data = "10/12/2025";
        String fraseExerciocio = "Eu " + nome + " morando no endereço, " + endereco + " confirmo que recebi o salário de " + "R$"+salario + " na data " + data;

        // Imprimindo a frase
        System.out.println(fraseExerciocio);
    }
}
