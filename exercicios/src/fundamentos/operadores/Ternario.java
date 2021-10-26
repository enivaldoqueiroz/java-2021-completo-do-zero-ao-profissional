package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		// TODO Ternario
		
		double media = 8.6;
		
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);

	}

}
