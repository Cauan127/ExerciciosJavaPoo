package ClinicaSaudeTotal;

public class PacienteConvenio extends Paciente{

    public PacienteConvenio(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void marcarConsulta() {
        System.out.println(getNome() + " paciente convênio: Consulta agendada conforme regras do convênio!\n");
    }
}
