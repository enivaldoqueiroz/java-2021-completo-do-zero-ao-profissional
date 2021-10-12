package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Console
		
		/*System.out.print("Bom");
		System.out.print(" dia!");
		
		System.out.println("\n");
		
		System.out.println("Bom");
		System.out.println(" dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %n", 1,2,3,4,5);
		
		//System.out.println("\n");
		
		System.out.printf("Salario: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		*/
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
				
		
		System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);
		
		entrada.close();
		
	}

}
