package classe;

public class AreaCircunferenciaTeste {

	public static void main(String[] args) {

		AreaCircunferencia a1 = new AreaCircunferencia(10);
		//a1.pi = 10;
		
		//AreaCircunferencia.pi = 3.1415;
		AreaCircunferencia a2 = new AreaCircunferencia(5);
		//a2.pi = 5;
		//AreaCircunferencia.pi = 0.1;
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCircunferencia.area(100));
		System.out.println(AreaCircunferencia.PI);
		System.out.println(Math.PI);
		
	}

}
