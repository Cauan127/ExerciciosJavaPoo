package Evento;

import java.util.ArrayList;

public class Evento {
    private ArrayList<Participante> participantes;

    public Evento() {
        participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Participante primario) {
        participantes.add(primario);
        System.out.println("Um participante foi adicionado!");
    }

    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("Nenhum participante registrado.");
            return;
        }
        System.out.println("Lista de Participantes:");
        for (Participante primario : participantes) {
            System.out.println("--> Nome: "+primario.getNome());
            System.out.println("--> Idade: "+primario.getIdade());
            System.out.println("--> Ingresso: "+primario.getTipoIngresso()+"\n");
        }
    }
}