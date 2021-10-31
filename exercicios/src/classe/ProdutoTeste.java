package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto p1 = new Produto("Notebook", 4356.89);
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//p2.desconto = 0.29;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		//double precoFinal1 = p1.preco * (1 - p1.desconto);
		//double precoFinal2 = p2.preco * (1 - p2.desconto);
		//double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		//Implementação do metodo precoComDesconto
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
		
	}

}
