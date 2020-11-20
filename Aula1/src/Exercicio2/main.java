package Exercicio2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Qual o ano actual?");
		int anoActual = input.nextInt();
		
		System.out.println("Qual o ano de nascimento?");
		int anoNascimento = input.nextInt();
		
		int idade = anoActual - anoNascimento;
		
		if (idade >= 18) {
			
			System.out.println("Qual o nome?");
			String nome = input.next();
			
			System.out.println(nome + ", sua entrada foi permitida.");
			
		}

	}

}
