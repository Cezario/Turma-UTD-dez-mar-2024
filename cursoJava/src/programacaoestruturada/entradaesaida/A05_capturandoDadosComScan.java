package programacaoestruturada.entradaesaida;

import java.util.Scanner;

public class A05_capturandoDadosComScan {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = leitor.nextInt();
		
		System.out.println("Seja bem vindo(a) ao curso de Lógica de Programação Java");
		
		System.out.println("======Aluno(a)======");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("====================");
		
		leitor.close();	

	}

}
