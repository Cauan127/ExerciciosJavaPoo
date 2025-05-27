package ClinicaSaudeTotal;

public class Main {
    public static void main(String [] args){

        PacienteComum comum = new PacienteComum("André Costa","123.456.789-99");
        PacienteVip vip = new PacienteVip("Ricardo Fontes","098.765.432-11");
        PacienteConvenio convenio = new PacienteConvenio("Alex Fonseca","232.546.577-43");

        comum.marcarConsulta();
        vip.marcarConsulta();
        convenio.marcarConsulta();
    }
}
