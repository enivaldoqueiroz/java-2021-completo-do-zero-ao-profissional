package estruturadecontrole;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Estrutura de controle if
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação!");
		}
		
		boolean criteriDeoReprovacaoAtingido = media < 4.5 && media >= 0;
		
		if(criteriDeoReprovacaoAtingido) {
			System.out.println("Reprovado!");
		}
		entrada.close();
	}

}
