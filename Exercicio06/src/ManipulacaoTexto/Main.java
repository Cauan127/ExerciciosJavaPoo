package ManipulacaoTexto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String entrada = scanner.nextLine();

        Texto texto = new Texto(entrada);

        System.out.println("\nTexto original: " + texto.getConteudo());
        System.out.println("Texto invertido: " + texto.inverter());
        System.out.println("Total de caracteres: " + texto.contarChar());

    }
}
