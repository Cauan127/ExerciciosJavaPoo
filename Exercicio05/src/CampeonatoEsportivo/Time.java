package CampeonatoEsportivo;

import java.util.ArrayList;

public class Time{
    private String nome;
    private ArrayList<String> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<String> jogadores) {
        this.jogadores = jogadores;
    }

    public void acrescentarJogador(String jogador){
        jogadores.add(jogador);
        System.out.println("Jogador adicionado com sucesso!");
    }

    public void tirarJogador(String jogador){
        if(jogadores.remove(jogador)){
            System.out.println("Jogador removido com sucesso!");
        }else{
            System.out.println("Jogador não encontrado!");
        }
    }

    public void listarJogadores(){
        System.out.println("===== Jogadores time "+nome+" =====\n");
        if(jogadores.isEmpty()){
            System.out.println("Nenhum jogador foi adicionado ou encontrado!");
        }else{
            for(String time : jogadores){
                System.out.println("--> "+time);
            }
        }
    }
}