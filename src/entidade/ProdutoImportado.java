package entidade;

public class ProdutoImportado extends Produto {

	private Double taxa;
	
	public ProdutoImportado() {
		
	}

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double totalP() {
		return super.getPreco()+taxa;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getNome() + " R$ " + totalP()+" (Taxa Alfandega: R$ "+taxa+")";
	} 
	
	
}
