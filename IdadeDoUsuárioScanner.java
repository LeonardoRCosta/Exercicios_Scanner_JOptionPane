package br.com.fiap;

import java.util.Scanner;

public class IdadeDoUsuárioScanner {
	public static void main(String[] args) {
		int ano_atual = 0, ano_nasc = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o ano atual");
			ano_atual = scan.nextInt();
			System.out.println("Digite seu ano de nascimento");
			ano_nasc = scan.nextInt();
			System.out.println("Sua idade é: " + (ano_atual - ano_nasc));
		} catch (Exception e) {
			System.out.println("Valor inválido");
		}
	}

}
