package EstoqueProdutos;

public class Produtos{
        private String nome;
        private double preco;
        private int quantidade;

        public Produtos(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = 0;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void adicionarEstoque(int valor) {
            if (valor > 0) {
                quantidade += valor;
            } else {
                System.out.println("Valor inválido para adicionar!");
            }
        }

        public void removerEstoque(int valor) {
            if (valor > 0 && valor <= quantidade) {
                quantidade -= valor;
            } else {
                System.out.println("Não é possível remover essa quantidade!");
            }
        }

        public String toString() {
            return "Produto: " + nome +
                    "\nPreço: R$ " + String.format("%.2f", preco) +
                    "\nQuantidade em estoque: " + quantidade + "\n";
        }
    }