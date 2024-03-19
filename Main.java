package CarrinhoDeCompras;

import java.util.Scanner;

public class Main {
	//classe pública para o scanner
	public static Scanner sc = new Scanner(System.in);
	
	//mostrar o menu
	public static void main(String[]args) { 
		menu();
	} 
	
	//método menu
	public static void menu() {
		Produto[]produtos = Produto.listarDados(); //recebe a lista de produtos
    
		double totalCompra = CarrinhoCompra.fecharCompra(produtos); //recebe o valor total da compra
    
		System.out.println("----------------------------------------------------------------");	
		System.out.println("Deseja ver seu carrinho de compras? (S ou N)");
		System.out.println("----------------------------------------------------------------");	
		String opcao1 = sc.nextLine();
		
		if(opcao1.equalsIgnoreCase("S")) {
			if(produtos.length == 10) {
				CarrinhoCompra.exibirProdutos(produtos); //exibir os produtos
				
				//encerrar compra
				System.out.println("----------------------------------------------------------------");	
				System.out.println("Deseja encerrar a compra? (S ou N)");
				System.out.println("----------------------------------------------------------------");	
				String opcao2 = sc.nextLine();
				
				if(opcao2.equalsIgnoreCase("S")) {
					System.out.println("----------------------------------------------------------------");	
					System.out.println("O valor total dessa compra foi: " + totalCompra);
					System.out.println("----------------------------------------------------------------");	
				}else {
					menu();
				}
			}else {
				System.out.print("Não existe produtos suficientes!");
			}
			
		}else {
			menu();
		}
    
	}
	
}
