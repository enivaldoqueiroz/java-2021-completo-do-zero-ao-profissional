package estruturadecontrole;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		// TODO Estrutura de repetição while indeterminado
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")){
			System.out.println("Voce diz: ");
			valor = entrada.nextLine();
		}
		
		System.out.println("Voce saiu!");
		
		entrada.close();
	}

}
