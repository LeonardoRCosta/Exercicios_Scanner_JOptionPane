package br.com.fiap;

import java.util.Scanner;

public class �reaDoC�rculoScanner {
	public static void main(String[] args) {
		double raio = 0;
		final double PI = 3.1416;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do raio");
			raio = scan.nextDouble();
			System.out.println("A �rea do c�rculo vale: " + (PI * (raio * raio)));
		} catch (Exception e) {
			System.out.println("Valor inv�lido");
		}
	}

}
