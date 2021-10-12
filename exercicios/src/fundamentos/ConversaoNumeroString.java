package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		// TODO ConversaoNumeroString
		
		Integer num1 = 10000;
		
		//Convertendo o numero em String e descobrindo a quantidade de caractares
		System.out.println(num1.toString().length());
		
		int num2 = 1000000;
		System.out.println(Integer.toString(num2).length());
		
		//Gabiarra usando a concatenação 
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}

}
