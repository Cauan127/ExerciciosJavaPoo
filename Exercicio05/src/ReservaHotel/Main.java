package ReservaHotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Reserva> reservas = new ArrayList<>();
        int escolha;
        int total = 0;

        do {
            System.out.println("\n===== Hotel - Reservas =====\n");
            System.out.println("1. Fazer reserva");
            System.out.println("2. Verificar disponibilidade");
            System.out.println("3. Listar reservas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha) {

                case 1:
                    System.out.print("Nome do hospede:");
                    String nome = scanner.nextLine();
                    System.out.print("Número do quarto:");
                    int quarto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entrada:");
                    String entrada = scanner.nextLine();
                    System.out.print("Saída:");
                    String saida = scanner.nextLine();

                    int i = 0;
                    int repetido = 0;
                    while (i < total) {
                        Reserva r = reservas.get(i);
                        if (r.getQuarto() == quarto) {
                            repetido = 1;
                        }
                        i++;
                    }

                    if (repetido == 0){
                        reservas.add(new Reserva(nome,quarto,entrada,saida));
                        total++;
                        System.out.println("Reserva feita com sucesso!");
                    } else {
                        System.out.println("Quarto já está ocupado.");
                    }
                    break;

                case 2:
                    System.out.print("Número do quarto: ");
                    quarto = scanner.nextInt();
                    scanner.nextLine();

                    i = 0;
                    int ocupado = 0;
                    while (i < total){
                        Reserva r = reservas.get(i);
                        if (r.getQuarto() == quarto) {
                            ocupado = 1;
                        }
                        i++;
                    }

                    if (ocupado == 0) {
                        System.out.println("Quarto disponível.");
                    } else {
                        System.out.println("Quarto já reservado.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Lista de Reservas ---");
                    int j = 0;

                    while (j < total) {
                        Reserva r = reservas.get(j);
                        System.out.println("Hóspede: " + r.getHospede());
                        System.out.println("Quarto: " + r.getQuarto());
                        System.out.println("Entrada: " + r.getEntrada());
                        System.out.println("Saída: " + r.getSaida());
                        System.out.println("---------------------------");
                        j++;
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Número inválido!");
                    break;
            }

        }while(escolha != 4);

    }
}