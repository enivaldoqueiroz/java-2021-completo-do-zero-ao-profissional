package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// TODO Desafio Calculadora
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o n�mero:");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o operador: ");
		String op = entrada.next();
		
		System.out.println("Informe n�mero:");
		double num2 = entrada.nextDouble();
		
		//Logica
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2: resultado;
		resultado = "*".equals(op) ? num1 * num2: resultado;
		resultado = "/".equals(op) ? num1 / num2: resultado;
		resultado = "%".equals(op) ? num1 % num2: resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();		

	}

}