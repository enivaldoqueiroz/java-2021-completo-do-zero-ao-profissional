package classe;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Desafio Data

		Data data1 = new Data();
		data1.dia = 3;
		data1.mes = 11;
		data1.ano = 1991;
		
		System.out.println("Data: " + data1.dia +"/" + data1.mes +"/"+ data1.ano);
		System.out.printf("Data: %d/%d/%d", data1.dia, data1.mes, data1.ano);
	}

}
