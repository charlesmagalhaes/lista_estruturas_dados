
public class ListaProdutos {
	
	
	 	int primeiro = 0;
	    int ultimo = 0;
	    int max;

	    private Produto[] listaProdutos;
	    
	    public ListaProdutos(int max) {
	        this.max = max;
	        this.listaProdutos = new Produto[max];
	    }
	    
	   
	    public boolean vazia(){
	        return (this.primeiro == this.ultimo);
	    }
	    
	    public void inserir(Produto produto){
	       /* if(this.ultimo >= this.listaProdutos.length){
	            System.out.println("Lista Cheia...Não é permitido adicionar outro produto");
	        }else{*/
	            this.listaProdutos[this.ultimo] = produto;
	            this.ultimo = this.ultimo+1;
	            System.out.println("Produto inserido com sucesso");
	       /* }*/
	    }
	    
	    public void imprimiLista(){
	    	if(vazia()) {
	    		System.out.println("Lista vazia!!!");
	    		
	    	}else {
		        for (int i=0; i < this.ultimo;i++){
		            System.out.println("Nome: "+listaProdutos[i].nome+" - Descrição: "+listaProdutos[i].descricao+
		                               " - Quantidade: "+listaProdutos[i].quantidade+"Valo Total: "+listaProdutos[i].valorVendatotal);
		        }
	    	}
	    }   
	    
	    public void FLVazia(){
	        listaProdutos = new Produto[max];
	        primeiro = 0;
	        ultimo = 0;
	    }
	    
	    public void remover(Produto produto) {
	    	int indexEncontrado = 0;
	    	 for (int i=0; i < this.ultimo;i++){
		            if(produto.nome == listaProdutos[i].nome) {
		            	indexEncontrado = i;
		            }
		        }
	    	 for(int i = indexEncontrado ; i < this.ultimo;i++) {
	    		 
	    	 }
	    	
	    }


}
