package br.com.fiap;

import java.util.Scanner;

public class MédiaAritméticaSimples {
	public static void main(String[] args) {
		double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite a primeira nota");
			nota1 = scan.nextDouble();
			System.out.println("Digite a segunda nota");
			nota2 = scan.nextDouble();
			System.out.println("Digite a terceira nota");
			nota3 = scan.nextDouble();
			System.out.println("Digite a quarta nota");
			nota4 = scan.nextDouble();
			System.out.println("Sua média é: " + (nota1 + nota2 + nota3 + nota4)/4);
		} catch (Exception e) {
			System.out.println("Valor incorreto");
		}
	}

}
