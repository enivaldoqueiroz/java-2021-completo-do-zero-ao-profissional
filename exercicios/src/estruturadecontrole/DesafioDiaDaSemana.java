package estruturadecontrole;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		// TODO Desafio dia da Semana
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String diaDaSemana = entrada.nextLine().toUpperCase();
		
		if(diaDaSemana.equals("DOMINGO")) {
			System.out.println(1);
		} else if(diaDaSemana.equals("SEGUNDA")) {
			System.out.println(2);
		} else if(diaDaSemana.equals("TERÇA")) {
			System.out.println(3);
		} else if(diaDaSemana.equals("QUARTA")) {
			System.out.println(4);
		} else if(diaDaSemana.equals("QUINTA")) {
			System.out.println(5);
		} else if(diaDaSemana.equals("SEXTA")) {
			System.out.println(6);
		} else if(diaDaSemana.equals("SABADO")) {
			System.out.println(7);
		}

	}

}
