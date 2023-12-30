package exercicios;

public class E02_maior_de_dois {

	public static void main(String[] args) {
		int numero01 = 36, numero02 = 100;
		
		int maior = ((numero01 + numero02) + Math.abs(numero01 - numero02)) / 2;
		
		System.out.println(maior);

	}

}
