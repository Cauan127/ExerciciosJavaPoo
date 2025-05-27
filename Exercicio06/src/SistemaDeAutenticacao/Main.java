package SistemaDeAutenticacao;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Autenticacao fator = new Autenticacao();
        Scanner scanner = new Scanner(System.in);

        fator.pedirAutenticacao();
        System.out.println("Inserir: ");
        String senha = scanner.nextLine();

        if(fator.autenticacaoCorreta(senha)){
            System.out.println("Senha correta, seja bem vindo!");
        }else{
            System.out.println("Senha incorreta, tente novamente!");
        }
    }
}
