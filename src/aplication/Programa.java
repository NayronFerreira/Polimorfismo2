package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidade.Produto;
import entidade.ProdutoImportado;
import entidade.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		List<Produto> listaProduto= new ArrayList<>();
		Scanner leia = new Scanner (System.in);
		SimpleDateFormat y = new SimpleDateFormat("dd/mm/yyy");
		System.out.println("Informe a quantidade de produto:");
		int n = leia.nextInt();
		Produto prod=null;
		Produto importado=null;
		Produto usado=null;
		
		for(int cc=1; cc<=n;cc++) {
			System.out.println("Informações do produto "+cc);
			System.out.println("O produto é comum, usado ou importado? (c/u/i): ");
			char resp = leia.next().charAt(0);
			leia.nextLine();
			System.out.println("Nome: ");
			String nome=leia.nextLine();
			System.out.println("Preço: ");
			Double preco= leia.nextDouble();
			
			if (resp=='c') {
				
				prod = new Produto(nome, preco);
				listaProduto.add(prod);
			}
			else if (resp=='i') {
				System.out.println("Taxa alfandega: ");
				double taxa = leia.nextDouble();
				importado = new ProdutoImportado(nome, preco, taxa);
				listaProduto.add(importado);
				
			}
			else {
				System.out.println("Data de fabricação (DD/MM/YYY): ");
				leia.nextLine();
				Date data = y.parse(leia.nextLine());
				usado = new ProdutoUsado(nome, preco, data);
				listaProduto.add(usado);
			}
		}
		
		System.out.println("Etiquetas de preço: ");
		for(Produto x:listaProduto) {
			System.out.println(x.toString());
		}
		
		

	}

}
