package OperacoesMatematicas;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Operacoes operacao = new Operacoes();
        Scanner scanner = new Scanner(System.in);
    int escolha = 0;
    double num;
    double num2;
    String equacao;
    double resultado;

    while(escolha !=2) {

        System.out.println("===== Menu =====\n");
        System.out.println("1 - Fazer calculo");
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
                        operacao.adicao(num,num2);
                        resultado = (num+num2);
                        System.out.println(num+" + "+num2+" = "+resultado);
                        break;

                    case "-":
                        operacao.subtracao(num,num2);
                        resultado = (num-num2);
                        System.out.println(num+" - "+num2+" = "+resultado);
                        break;

                    case "x":
                        operacao.multiplicacao(num,num2);
                        resultado = (num*num2);
                        System.out.println(num+" x "+num2+" = "+resultado);
                        break;

                    case "/":
                        operacao.divisao(num,num2);
                        resultado = (num/num2);
                        System.out.println(num+" / "+num2+" = "+resultado);
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
