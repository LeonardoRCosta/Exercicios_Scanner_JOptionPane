package br.com.fiap;

import javax.swing.JOptionPane;

public class �reaDoC�rculoJOption {
	public static void main(String[] args) {
		final double PI = 3.1416;
		double raio = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o valor do raio");
			raio = Double.parseDouble(aux);
			JOptionPane.showMessageDialog(null, "A �rea do c�rculo �: " + (PI * (raio * raio)));
			
		} catch (Exception e) {
			System.out.println("Valor inv�lido");
		}
	}

}
