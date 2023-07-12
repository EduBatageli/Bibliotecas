package br.com.libs.testeNumero;

import javax.swing.JOptionPane;

public class ValidarNumero {
	private String numeroRecebido;
	private double numeroDevolvido;
	
	
	public Double getNumero() {
		if(numeroRecebido.contains(",")) {
			JOptionPane.showMessageDialog(null, "o numero tem virgula");
			String nuemroComPonto = numeroRecebido.replace(",", ".");
			numeroDevolvido = Double.parseDouble(nuemroComPonto);
			
		}else {
			JOptionPane.showMessageDialog(null, "o numero tem ponto");
			numeroDevolvido = Double.parseDouble(numeroRecebido);
		}
		return numeroDevolvido;
	}

	public void setNumero(String numeroRecebido) {
		this.numeroRecebido = numeroRecebido;
	}
}
