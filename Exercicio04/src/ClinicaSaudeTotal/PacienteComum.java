package ClinicaSaudeTotal;

public class PacienteComum extends Paciente{

    public PacienteComum(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void marcarConsulta(){
        System.out.println("===== Agendamento consultas =====\n");
        System.out.println(getNome() + " paciente comum: Agendado com sucesso!\n");
    }
}
