package fundamentos.desafios;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		// TODO Desafio Calculo IMC
		
		/*Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculo do IMC");
		System.out.println("Digite o peso: ");
		double peso = entrada.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / altura;
		
		System.out.println("IMC: " + imc);
		
		entrada.close();
		

	}

}
