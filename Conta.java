package br.casa.estudos.curso.poo.banco;

public class Conta {

	public static void main(String[] args) {
		Banco p1 = new Banco(0, false);
		p1.setNumConta(1111);
		p1.setDono("André");
		p1.abrirConta("CC");
		p1.estadoAtual();
	}

}
