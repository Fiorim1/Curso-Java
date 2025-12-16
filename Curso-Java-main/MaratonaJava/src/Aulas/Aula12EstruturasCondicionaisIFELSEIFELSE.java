package Aulas;

public class Aula12EstruturasCondicionaisIFELSEIFELSE {
    public static void main(String[] args) {
        int idade = 21;

        int comprarBebidaalcolica = 21;

        // O IF só executa se a condição for verdadeira (true)
        if (idade > comprarBebidaalcolica) {
            System.out.println("Autorizado a comprar bebida alcolica");
            // O else-if só irá funcionar se o if for falso
        } else if (idade == comprarBebidaalcolica) {
            System.out.println("Pode comprar apenas 02 cervejas");
        } else {
            System.out.println("Proibido comprar bebida alcolica");
        }

    }
}
