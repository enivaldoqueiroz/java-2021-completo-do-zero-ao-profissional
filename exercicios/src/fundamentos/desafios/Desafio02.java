package fundamentos.desafios;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor: ");
		int v1 = entrada.nextInt();
		
		int vQuadrado = v1 * v1;
		System.out.printf("Valor de %d² é %d", v1,vQuadrado);
		int vCubo = v1 * v1 * v1;
		System.out.printf("\nValor de %d³ é %d", v1,vCubo);
		
		entrada.close();

	}

}
