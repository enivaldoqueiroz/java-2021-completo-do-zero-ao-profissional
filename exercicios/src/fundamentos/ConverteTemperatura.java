package fundamentos;

public class ConverteTemperatura {

	public static void main(String[] args) {
		// Desafio converter grau Celsius para Fahrenheit
		
		double temperaturaCelsius  = 200;
		double temperaturaFahrenheit = 150;
		
		double celsius;
		double fahrenheit;
		
		final int CONST_A = 32;
		final double CONST_B = 1.8;
		
		fahrenheit = (temperaturaCelsius * CONST_B) + CONST_A;
		celsius = (temperaturaFahrenheit - CONST_A)/CONST_B;
		
		System.out.println("Conver��o de " + temperaturaCelsius + " grau Celsius para Fahrenheit � " + Math.round(fahrenheit) + "�F");
		
		System.out.println("Conver��o de " + temperaturaFahrenheit + " grau Fahrenheit para Celsius � " + Math.round(celsius) + "�C");
		
		

	}

}
