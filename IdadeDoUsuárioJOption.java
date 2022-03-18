package br.com.fiap;

import javax.swing.JOptionPane;

public class IdadeDoUsuárioJOption {
	public static void main(String[] args) {
		int ano_atual = 0, ano_nasc = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o ano atual");
			ano_atual = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite seu ano de nascimento");
			ano_nasc = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "Sua idade é: " + (ano_atual - ano_nasc));
		} catch (Exception e) {
			System.out.println("Valor inválido");
		}
	}

}
