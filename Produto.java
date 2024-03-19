package CarrinhoDeCompras;

//classe pública que pode ser acessada por outras classes
public class Produto { 
	//declarar variáveis - só podem ser modificadas na própria classe
	private int codigo;
	private String descProduto;
	private double preco;
	private int quantidade;
	
	public Produto(int codigo, String descProduto, double preco, int quantidade) { 
        	this.codigo = codigo;
        	this.descProduto = descProduto;
        	this.preco = preco;
        	this.quantidade = quantidade;
	}

    // receber o valor das variáveis privadas e modificá-los
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) { //void não retorna valor nenhum
        this.codigo = codigo;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
	
	//adicionar dados dos produtos
	public static Produto[]listarDados() { //static pois não precisa ser instanciado para funcionar
		Produto[] produtos = new Produto[10];
		
		int[] codigo = {1,2,3,4,5,6,7,8,9,10};
		String[] descProduto = {"Detergente", "Rodo", "Sabonete", "Desinfetante", "Vassoura", "Pano de Chão", "Álcool", "Sabão em pó", "Amaciante", "Espanador"};
		double[] preco = {2.89, 25.0, 5.0, 18.92, 15.32, 4.0, 10.99, 23.90, 21.92, 23.98};
		int[] quantidade = {2,1,4,1,1,3,1,1,1,2};
		
		//adicionar os elementos na lista
		for(int i=0; i<10; i++) {
			produtos[i] = new Produto(codigo[i], descProduto[i], preco[i], quantidade[i]);
		}
		return produtos;
	}
}
