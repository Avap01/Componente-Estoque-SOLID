

import java.util.HashMap;
import java.util.Map;


public class estoque_produtos {
	
	
	    private Map<String, Integer> produtosNoEstoque = new HashMap<>();

	    public void adicionarProduto(String produto, int quantidade) {
	        produtosNoEstoque.put(produto, produtosNoEstoque.getOrDefault(produto, 0) + quantidade);
	        System.out.println(quantidade + " unidades de " + produto + " adicionadas ao estoque.");
	    }

	    public void removerProduto(String produto, int quantidade) {
	        int quantidadeAtual = produtosNoEstoque.getOrDefault(produto, 0);
	        if (quantidadeAtual <= quantidade) {
	            produtosNoEstoque.remove(produto);
	            System.out.println("Produto " + produto + " removido do estoque.");
	        } else {
	            produtosNoEstoque.put(produto, quantidadeAtual - quantidade);
	            System.out.println(quantidade + " unidades de " + produto + " removidas do estoque.");
	        }
	    }

	    public int consultarQuantidade(String produto) {
	        return produtosNoEstoque.getOrDefault(produto, 0);
	    }

	    public void listarProdutos() {
	        System.out.println("Produtos disponiveis no estoque:");
	        for (Map.Entry<String, Integer> entry : produtosNoEstoque.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
	        }
	    }}