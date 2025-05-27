import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
      int escolha = 0;
      String equacao;
      int num;
      int num2;
      int total;

      while(escolha !=2) {
          System.out.println("===== Menu =====\n\n");
          System.out.println("1 - Fazer equação");
          System.out.println("2 - sair");
          System.out.println("Escolha umas das opções: ");
          escolha = scanner.nextInt();
          scanner.nextLine();

      switch (escolha){

          case 1:
              System.out.println("Informe o tipo de equação(+,-,x,/): ");
              equacao = scanner.nextLine();
              System.out.println("Informe o primeiro número: ");
              num = scanner.nextInt();
              System.out.println("Informe o segundo número: ");
              num2 = scanner.nextInt();

              switch (equacao){

                  case "+":
                      total = num+num2;
                      System.out.println(num+" + "+num2+" = "+total);
                      break;

                  case "-":
                      total = num - num2;
                      System.out.println(num+" - "+num2+" = "+total);
                      break;

                  case "x":
                      total = num*num2;
                      System.out.println(num+" x "+num2+" = "+total);
                      break;

                  case "/":
                      total = num/num2;
                      System.out.println(num+" / "+num2+" = "+total);
                      break;
              }
              break;

          case 2:
              System.out.println("Saindo...");
              break;
      }
      }
    }
}
