package br.com.fiap;

import javax.swing.JOptionPane;

public class MédiaAritméticaSimplesJOption {
	public static void main(String[] args) {
		double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite a primeira nota");
			nota1 = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite a segunda nota");
			nota2 = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite a terceira nota");
			nota3 = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite a quarta nota");
			nota4 = Double.parseDouble(aux);
			JOptionPane.showMessageDialog(null,"Sua média é: " + (nota1 + nota2 + nota3 + nota4)/4);
		} catch (Exception e) {
			System.out.println("Valor Incorreto");
		}
	}

}
