package classe;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Desafio Data

		Data data1 = new Data();
//		data1.dia = 3;
//		data1.mes = 11;
//		data1.ano = 1991;
		
		Data data2 = new Data(21 , 6, 1990);
		
		
		//System.out.println("Data: " + data1.dia +"/" + data1.mes +"/"+ data1.ano);
		//System.out.printf("Data: %d/%d/%d", data1.dia, data1.mes, data1.ano);
		//System.out.printf("Data: " + data1.obterDataFormatada());
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}

}
