
public class Produto {
	
	  	int quantidade;
	    double valorVendatotal;
	    String nome;
	    String descricao;

	    public Produto(int quantidade, double valorVendatotal, String nome, String descricao) {
	        this.quantidade = quantidade;
	        this.valorVendatotal = valorVendatotal;
	        this.nome = nome;
	        this.descricao = descricao;
	    }
	    
	    

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }

	    public double getValorVendatotal() {
	        return valorVendatotal;
	    }

	    public void setValorVendatotal(double valorVendatotal) {
	        this.valorVendatotal = valorVendatotal;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }


}
