import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Quantos produtos deseja cadastrar?");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        Produto[] vetorProdutos = new Produto[numero];

        for (int p=0; p< vetorProdutos.length; p ++){
            System.out.println("Produto"+ (p+1));
            System.out.println("Digite o nome do produto");
            scan.nextLine();

            String nomeCadastro = scan.nextLine();
            System.out.println("Preco do produto");
            Double precoCadastro= scan.nextDouble();
            System.out.println("Usando apenas uma letra, escolha o tipo de produto: (i) importado (u) usado (c) outro produto");
            char tipoProduto = scan.next().charAt(0);

            switch (tipoProduto){
                case 'i'-> {
                    System.out.println("Qual é o valor da taxa alfandegaria?");
                    Double txAlfandegariaCadastro  = scan.nextDouble();
                    vetorProdutos[p] = new ProdutoImportado(nomeCadastro, precoCadastro, tipoProduto, txAlfandegariaCadastro);

                }
                case 'u'-> {
                    System.out.println("Qual a data de fabricacao");
                    String dataFabricacao = scan.next();
                    vetorProdutos[p]= new ProdutoUsado(nomeCadastro,precoCadastro, tipoProduto, dataFabricacao);
                }
                case 'c'-> vetorProdutos[p]= new Produto(nomeCadastro,precoCadastro,tipoProduto);
                default -> System.out.println("Entrada incorreta. Cadastro Invalido");
                }
            }
        System.out.println("Entre com o numero de produtos"+ numero);
        for (int i=0 ; i < vetorProdutos.length; i ++){
            System.out.println(vetorProdutos[i].toString());
        }
        System.out.println("Amostragem de precos dos produtos:" + "\n");
        for (int j = 0; j < vetorProdutos.length; j++) {
            System.out.println(vetorProdutos[j].mostrarProduto());

        }

    }
}