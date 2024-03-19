package CarrinhoDeCompras;

public class CarrinhoCompra {
	
	//método exibir produtos
	public static void exibirProdutos(Produto[]produtos) {
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%-10s %-20s %-10s %-15s %-15s\n", "CÓDIGO", "PRODUTO", "PREÇO", "QUANTIDADE", "TOTAL");
		System.out.println("----------------------------------------------------------------");
		
		for(Produto produto: produtos) {
			double total = produto.getPreco() * produto.getQuantidade();
			System.out.printf("%-10d %-20s %-10.1f %-15d %-15.1f\n", produto.getCodigo(), produto.getDescProduto(), produto.getPreco(), produto.getQuantidade(), total);
		}
		System.out.println("----------------------------------------------------------------");	
	}
	
	//método fechar compra
	public static double fecharCompra(Produto[] produtos) {
		double valorTotal = 0;
		for(Produto produto: produtos) {
				valorTotal += produto.getPreco()*produto.getQuantidade();
		}
		return valorTotal;
	}		
	
}
	

