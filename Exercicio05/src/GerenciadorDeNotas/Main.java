package GerenciadorDeNotas;

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        int opcao;

        do{
            System.out.println("===== MENU =====\n");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Lançar notas");
            System.out.println("3 - Lançar N3");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1){
                System.out.print("Nome do aluno: ");
                String nome = sc.nextLine();
                System.out.print("Matrícula: ");
                String matricula = sc.nextLine();
                Aluno novoAluno = new Aluno(nome, matricula);
                alunos.add(novoAluno);
                System.out.println("Aluno cadastrado com sucesso!\n");

            }else if(opcao == 2){
                System.out.print("Matrícula do aluno: ");
                String matriculaBusca = sc.nextLine();
                Aluno alunoEncontrado = null;
                for(Aluno a : alunos) {
                    if(a.getMatricula().equals(matriculaBusca)){
                        alunoEncontrado = a;
                        break;
                    }
                }

                if(alunoEncontrado != null){
                    System.out.print("Nota N1: ");
                    alunoEncontrado.setN1(sc.nextDouble());
                    System.out.print("Nota N2 - Prova: ");
                    alunoEncontrado.setN2Prova(sc.nextDouble());
                    System.out.print("Nota N2 - Trabalho: ");
                    alunoEncontrado.setN2Trabalho(sc.nextDouble());
                    alunoEncontrado.calcularMedia();
                    System.out.println("Notas lançadas com sucesso!\n");
                }else{
                    System.out.println("Aluno não encontrado.\n");
                }

            } else if(opcao == 3){
                System.out.print("Matrícula do aluno: ");
                String matriculaBusca = sc.nextLine();
                Aluno alunoEncontrado = null;

                for(Aluno a : alunos){
                    if(a.getMatricula().equals(matriculaBusca)){
                        alunoEncontrado = a;
                        break;
                    }
                }

                if(alunoEncontrado != null){
                    System.out.print("Nota N3: ");
                    alunoEncontrado.setN3(sc.nextDouble());
                    alunoEncontrado.calcularNotaFinalComN3();
                    System.out.println("N3 lançada com sucesso!\n");
                }else{
                    System.out.println("Aluno não encontrado.\n");
                }

            }else if(opcao == 4){
                if(alunos.isEmpty()){
                    System.out.println("Nenhum aluno cadastrado.\n");
                }else{
                    for(Aluno a : alunos){
                        System.out.println(a);
                    }
                }

            }else if(opcao == 5){
                System.out.println("Saindo do programa...\n");
            }else{
                System.out.println("Opção inválida.\n");
            }

        }while(opcao != 5);

    }
}