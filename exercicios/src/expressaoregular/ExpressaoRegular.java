package expressaoregular;

import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniProduto uniProduto = new UniProduto();
		
		uniProduto.setCodigoProduto("P901001517");
		
		String auxProdutoUnimed = uniProduto.getCodigoProduto();
		
		boolean n = auxProdutoUnimed.contains(auxProdutoUnimed);
		
		//Pattern p = Pattern.compile("[a-zA-Z]{1}[0-9]{9}");
		Pattern p = Pattern.compile("[a-zA-Z]{1}[0-9]{9}");
		
		
		
		System.out.println(p.matcher(auxProdutoUnimed).matches());
		System.out.println(n);

	}

}
