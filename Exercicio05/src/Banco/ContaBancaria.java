package Banco;

import java.util.ArrayList;

public class ContaBancaria{
    private double saldo;
    private ArrayList<String> historicoTransacao;

    public ContaBancaria(){
        this.saldo = 0.0;
        this.historicoTransacao = new ArrayList<>();
    }

    public void saque(double dinheiro){
        if(dinheiro > 0 && dinheiro <= saldo){
            saldo -= dinheiro;
        historicoTransacao.add("Saque de R$"+dinheiro);
        System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente, tente um valor menor!");
        }
    }

    public void deposito(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Valor depositado com sucesso!");
        }else{
            System.out.println("Erro, tente um valor real!");
        }
    }

    public void exibirExtrato(){
        System.out.println("===== Extrato =====\n");
        for(String transacao : historicoTransacao){
            System.out.println(transacao);
        }
        System.out.println("Saldo: R$"+saldo);
    }
}
