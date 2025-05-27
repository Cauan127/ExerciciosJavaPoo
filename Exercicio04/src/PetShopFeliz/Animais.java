package PetShopFeliz;

public abstract class Animais {
    private String nome;
        private int idade;

        public Animais(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public abstract void servicos();
}
