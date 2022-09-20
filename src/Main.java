
public class Main {

	public static void main(String[] args) {
		
		 	ListaProdutos gabriel = new ListaProdutos(10);
	        
	        Produto produto1 = new Produto(1, 5.0, "Leite", "Leite desnatado 1L");
	        Produto produto2 = new Produto(1, 2.0, "Pao", "Pao Frances 100G");
	        Produto produto3 = new Produto(1, 40.0, "Carne", "Carne de boi 1kg");
	        Produto produto4 = new Produto(1, 12.0, "Iorgute", "Morango 1L");
	        Produto produto5 = new Produto(1, 6.0, "Macarrão", "Leite desnatado");
	        Produto produto6 = new Produto(12, 40.0, "Cerveja", "Puro Malte 475ml");
	        Produto produto7 = new Produto(1, 14.0, "Café", "500g");
	        Produto produto8 = new Produto(3, 6.0, "Sabonete", "lux");
	        Produto produto9 = new Produto(1, 40.0, "Oleo", "1L");
	        Produto produto10 = new Produto(1, 40.0, "Frango", "Frango pedaços sortidos 1kg");
	       
	        
	        gabriel.inserir(produto1);
	        gabriel.inserir(produto2);
	        gabriel.inserir(produto3);
	        gabriel.inserir(produto4);
	        gabriel.inserir(produto5);
	        gabriel.inserir(produto6);
	        gabriel.inserir(produto7);
	        gabriel.inserir(produto8);
	        gabriel.inserir(produto9);
	        gabriel.inserir(produto10);
	        
	        gabriel.imprimiLista();

	        
	        gabriel.remover(produto10);
	        
	        System.out.println("-----------------------------------------------------------");
	        gabriel.imprimiLista();


	}

}
