package Contador;

public class Main {
    public static void main(String[] args) {
        Contador primeiroObjeto = new Contador();
        Contador segundoObjeto = new Contador();

        System.out.println("Total objetos criados: "+Contador.getObjetosTotal());
    }
}
