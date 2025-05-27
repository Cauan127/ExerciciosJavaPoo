package AreaDeCirculoPI;

import java.util.Scanner;

import static AreaDeCirculoPI.Operacao.adicao;
import static AreaDeCirculoPI.Operacao.areaDoCirculo;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do{

            System.out.println("Escolha uma operação:");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Calcular área do círculo");
            System.out.print("Informe sua escolha: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha) {

                case 1:
                    System.out.println("Informe o primeiro número: ");
                    double num = scanner.nextDouble();
                    System.out.println("Informe o segundo número: ");
                    double num1 = scanner.nextDouble();
                    double soma = adicao(num,num1);
                    System.out.println("Resultado: "+soma+"\n\n");
                    break;

                case 2:
                    System.out.println("Informe a área do círculo: ");
                    double raio = scanner.nextDouble();
                    double area = areaDoCirculo(raio);
                    System.out.println("Área do círculo: "+area+"\n\n");

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Número inválindo, tente outro!\n");
                    break;
            }
        }while(escolha != 3);
    }
}