package classe;

public class AreaCircunferencia {

	double raio;
	final static double PI = 3.1415;
	
	public AreaCircunferencia(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
