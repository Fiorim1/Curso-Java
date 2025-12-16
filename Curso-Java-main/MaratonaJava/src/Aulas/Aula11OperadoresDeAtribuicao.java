package Aulas;

public class Aula11OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // = += -= *= /= %=
        double bonus = 1800d;

        // Adiconar R$1000,00 de bonus
        bonus += 1000d;
        System.out.println(bonus);

        // Subtrair R$1000,00 de bonus
        bonus -= 1000d;
        System.out.println(bonus);

        // Multiplicar o valor de bonus por 2x
        bonus *= 2;
        System.out.println(bonus);

        // Dividir por 2 o valor de bonus
        bonus /= 2;
        System.out.println(bonus);

        // resto da divisão por 7 do valor de bonus
        bonus %= 7;
        System.out.println(bonus);


        // Incrementar
        int contador = 0;
        // Somar mais 1
        contador++;
        // Diminuir menos 1
        contador--;
        System.out.println(contador);
    }
}
