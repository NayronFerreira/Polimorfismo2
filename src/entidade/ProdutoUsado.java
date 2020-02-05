package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	SimpleDateFormat y = new SimpleDateFormat("dd/mm/yyyy");
	
	private Date dataDeFabri;
	
	public ProdutoUsado() {
		
	}

	public ProdutoUsado(String nome, Double preco, Date dataDeFabri) {
		super(nome, preco);
		this.dataDeFabri = dataDeFabri;
	}

	public Date getDataDeFabri() {
		return dataDeFabri;
	}

	public void setDataDeFabri(Date dataDeFabri) {
		this.dataDeFabri = dataDeFabri;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getNome() +" (usado)"+ " R$ " + super.getPreco()+" Fabricado em: "+y.format(dataDeFabri); 
	}
	
	

}
