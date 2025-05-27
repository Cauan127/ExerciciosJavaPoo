package ClinicaSaudeTotal;

public class PacienteVip extends Paciente{

    public PacienteVip(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void marcarConsulta() {
        System.out.println(getNome() + " paciente VIP: sua consulta foi agendada como prioridade!\n");
    }
}
