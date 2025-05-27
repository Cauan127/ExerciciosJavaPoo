package AcademiaPowerFit;

public class Main {
    public static void main(String[] args){

        Basico basico = new Basico(70.00,"Nenhum");
        Intermediario medio = new Intermediario(110.00,"Cadeira de massagem","Exclusiva a clientes médios e vips!");
        Premium vip = new Premium(170.00,"Todos","Aulas de pilates, cadeira de massagem!");

        basico.exibirPlanos();
        medio.exibirPlanos();
        vip.exibirPlanos();
    }
}
