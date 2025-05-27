package Contador;

public class Contador{
    private static int objetosTotal = 0;

    public Contador(){
        objetosTotal++;
    }

    public static int getObjetosTotal() {
        return objetosTotal;
    }

    public static void setObjetosTotal(int objetosTotal) {
        Contador.objetosTotal = objetosTotal;
    }
}