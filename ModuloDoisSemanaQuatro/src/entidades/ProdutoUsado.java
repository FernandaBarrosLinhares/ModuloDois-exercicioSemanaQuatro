package entidades;



public class ProdutoUsado extends Produto {

    private String dataFabricacao;

    public ProdutoUsado(String nome, Double preco, char tipo, String dataFabricacao) {
        super(nome, preco, tipo);
        this.dataFabricacao = dataFabricacao;
    }
    public String mostrarProduto(){
        return getNome() + "(usado)"+ getPreco()+
                "Data de fabricacao (DD/MM/YYYY):" + dataFabricacao;
}
}


