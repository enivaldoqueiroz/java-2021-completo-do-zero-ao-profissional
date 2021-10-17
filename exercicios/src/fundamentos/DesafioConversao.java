package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Desafio Conversao
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o 1º salario: ");
		//String s1 = entrada.next().replace(",", "."); Outra forma de resolvar o sesafio
		String s1 = entrada.nextLine();
		s1 = s1.replaceAll(",", ".");
		System.out.println("Digite o 2º salario: ");
		String s2 = entrada.nextLine();
		s2 = s2.replaceAll(",", ".");
		System.out.println("Digite o 3º salario: ");
		String s3 = entrada.nextLine();
		s3 = s3.replaceAll(",", ".");
		
		double salario1 = Double.parseDouble(s1);
		double salario2 = Double.parseDouble(s2);
		double salario3 = Double.parseDouble(s3);
		
		double media = (salario1 + salario2 + salario3)/3;
		
		System.out.println(media);

	}

}
