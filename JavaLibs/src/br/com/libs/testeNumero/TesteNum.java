package br.com.libs.testeNumero;

public class TesteNum {

	public static void main(String[] args) {
		ValidarNumero num = new ValidarNumero();
		num.setNumero("12,3");
		System.out.println("numero transformado " + num.getNumero());

	}

}
