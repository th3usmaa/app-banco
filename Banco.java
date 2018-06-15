package br.casa.estudos.curso.poo.banco;

public class Banco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public Banco(int n, String t, String d, float s, boolean st) {
		s = 0;
		st = false;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean st) {
		this.status = st;
	}

	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		if (t == "CC") {
			setSaldo(50);
		} else if (t == "CP") {
			setSaldo(150);

		}

	}

	void fecharConta() {

	}

	void depositar() {

	}

	void sacar() {

	}

	void pagarMensal() {

	}
}
