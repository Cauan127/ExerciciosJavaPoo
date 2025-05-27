package FormasGeometricas;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int escolha;

      do{

         System.out.println("\n===== Área e perimêtro =====\n");
         System.out.println("1 - Área e perimêtro do retângulo");
         System.out.println("2 - Área e perimêtro do triangulo");
         System.out.println("3 - Sair");
         System.out.println("Escolha uma das opções acima: ");
          escolha = scanner.nextInt();
          scanner.nextLine();

        if(escolha == 1){
            System.out.println("Informe a Largura: ");
            double largura = scanner.nextDouble();
            System.out.println("Informe a altura: ");
            double altura = scanner.nextDouble();
            Retangulo retangulo = new Retangulo(largura,altura);
            System.out.println("===== Resultado =====\n");
            System.out.println("Área --> "+retangulo.calcularAreaRetangulo());
            System.out.println("Perimêtro --> "+retangulo.calcularPerimetroRetangulo());
        }

        if(escolha == 2){
            System.out.println("Informe a Largura: ");
            double largura = scanner.nextDouble();
            System.out.println("Informe a altura: ");
            double altura = scanner.nextDouble();
            System.out.println("Informe os seus lados(perimêtro): ");
            double lado = scanner.nextDouble();
            Triangulo triangulo = new Triangulo(largura,altura,lado);
            System.out.println("===== Resultado =====\n");
            System.out.println("Área --> "+triangulo.calcularAreaTriangulo());
            System.out.println("Perimêtro --> "+triangulo.calcularPerimetroTriangulo());
        }

        if(escolha == 3){
            System.out.println("Saindo...");
            break;
        }

      }while(escolha != 3);

    }
}
