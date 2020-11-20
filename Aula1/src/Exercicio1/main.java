package Exercicio1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		System.out.println("Qual o número factorial?");
		
		int numero = input.nextInt();
		int factorial = numero;
		
		for (int i = numero-1; i > 0; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("Resultado = " + factorial);
	}

}
