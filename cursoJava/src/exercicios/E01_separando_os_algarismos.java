package exercicios;

import java.util.Scanner;

public class E01_separando_os_algarismos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número de 3 casas: ");
		int numero = leitor.nextInt();
		
		int unidade = numero % 10;
		
		int dezena = numero % 100 / 10;
		
		int centena = numero / 100;
		
		System.out.println("Unidade: " + unidade);
		
		System.out.println("Dezena: " + dezena);
		
		System.out.println("Centena: " + centena);
		
		leitor.close();

	}

}
