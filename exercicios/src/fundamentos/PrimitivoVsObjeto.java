package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		// TODO PrimitivoVsObjeto
		
		//String s = "texto";
		String s = new String("texto");
		String ss = s.toUpperCase();
		
		System.out.println(ss);
		
		//Wrappers(Embrulho) - Versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}

}
