package classe;

public class ValorNull {

	public static void main(String[] args) {
		// TODO Valor null
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		//String s2 = null;
		if(s2 != null) {
			System.out.println(s2.concat("???"));
		}
	}

}
