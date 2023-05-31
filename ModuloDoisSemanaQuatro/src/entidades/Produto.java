package entidades;

public class Produto {
    private String nome;
    private Double preco;

    private char tipo;


    public Produto(String nome, Double preco, char tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String mostrarProduto(){
        return nome + "R$" + preco;

    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }


    @Override
    public String toString(){
        return "Comum, usado ou importado(c/u/i ?" + tipo+ "\n"+
                "nome" + nome +
                "\nPreco R$" + preco;
    }
}


