package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO TipoString
		
		System.out.println("Olá pesssoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: " + nome + 
				   "\nSobrenome: " + sobrenome +
				   "\nIdade: " + idade +
				   "\nsalario: " + salario + "\n\n";
		
		System.out.println(maisUmaFrase);
		
		System.out.println("Nome: " + nome + 
						   "\nSobrenome: " + sobrenome +
						   "\nIdade: " + idade +
						   "\nsalario: " + salario);
		System.out.println("---------------------------------------------------\n\n");
		
		System.out.printf("O senho %s %s temr %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senho %s %s temr %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario, args);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 8));
	}

}
