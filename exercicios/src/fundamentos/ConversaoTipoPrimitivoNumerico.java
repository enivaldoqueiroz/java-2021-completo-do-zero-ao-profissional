package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		// TODO Conversao Tipo Primitivo Numerico
		
		double a = 1.1234567888888888; //Conversão implicita
		System.out.println(a);
		
		float b = (float) 1.1234567888888888; //Conversão explicita (CAST)
		System.out.println(b);
		
		int c = 256;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		
		System.out.println(f);
	}

}
