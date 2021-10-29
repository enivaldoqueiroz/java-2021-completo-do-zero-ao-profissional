package estruturadecontrole;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		// TODO Desafio dia da Semana
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String diaDaSemana = entrada.nextLine().toUpperCase();
		
		/*if(diaDaSemana.equals("DOMINGO")) {
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
		}*/
		
		//Outra forma de resolver o desafio dia da Semana
		
		if("domingo".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(1);
		} else if("segunda".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(2);
		} else if("terça".equalsIgnoreCase(diaDaSemana) || "terca".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(3);
		} else if("quarta".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(4);
		} else if("quinta".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(5);
		} else if("sexta".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(6);
		} else if("sábado".equalsIgnoreCase(diaDaSemana) || "sabado".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido!");
		}

	}

}
