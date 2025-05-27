package GerenciarFuncionarios;

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int escolha;

        do{

            System.out.println("===== Menu =====\n");
            System.out.println("1 - acrescentar funcionário");
            System.out.println("2 - Mostrar funcionário(s)");
            System.out.println("3 - Reajustar Salário");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma das opções acima: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

        switch(escolha){

            case 1:
                System.out.println("Nome:");
                String nome = scanner.nextLine();
                System.out.println("Cargo:");
                String cargo = scanner.nextLine();
                System.out.println("Salário:");
                double salario = scanner.nextDouble();
                scanner.nextLine();
                funcionarios.add(new Funcionario(nome,cargo,salario));
                System.out.println("Funcionário adicionado!");
                break;

            case 2:
                if(funcionarios.isEmpty()){
                    System.out.println("Nenhum funcionário encontrado!");
                }else{
                    System.out.println("Funcionários: \n");
                    for(Funcionario empresa : funcionarios){
                        empresa.mostrarFuncionario();
                    }
                }
                break;

            case 3:
                System.out.print("Digite o nome do funcionário: ");
                String nomeBusca = scanner.nextLine();
                boolean encontrado = false;

                for(Funcionario empresa : funcionarios){
                    if(empresa.getNome().equalsIgnoreCase(nomeBusca)){
                        System.out.print("Percentual de reajuste (%): ");
                        double percentual = scanner.nextDouble();
                        scanner.nextLine();
                        empresa.reajusteSalarial(percentual);
                        System.out.println("Salário reajustado com sucesso.");
                        encontrado = true;
                        break;
                    }
                }

                if(!encontrado) {
                    System.out.println("Funcionário não encontrado.");
                }
                break;

            case 4:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Número inválido, tente outro!");
                break;
        }

     }while (escolha != 4);

    }
}
