package br.com.fiap;

import javax.swing.JOptionPane;

public class ÁreaDoCírculoJOption {
	public static void main(String[] args) {
		final double PI = 3.1416;
		double raio = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o valor do raio");
			raio = Double.parseDouble(aux);
			JOptionPane.showMessageDialog(null, "A área do círculo é: " + (PI * (raio * raio)));
			
		} catch (Exception e) {
			System.out.println("Valor inválido");
		}
	}

}
