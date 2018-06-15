package br.casa.estudos.curso.poo.banco;

public class Banco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public Banco(float s, boolean st) {
		s = 0;
		st = false;
	}

	public void estadoAtual() {
		System.out.println("--------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
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
		System.out.println("Conta aberta com sucesso!");

	}

	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("A conta não pode ser fechada pois ainda contém dinheiro!");
		} else if (saldo < 0) {
			System.out.println("A conta não pode ser fechada pois contém débito!");
		} else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float v) {
		if (status == true) {
			setSaldo(getSaldo() + v);
			System.out.println("Deposito realizado na conta de: " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em uma conta fechada!");
		}
	}

	public void sacar(float v) {
		if (status == true) {
			if (getSaldo() > v) {
				setSaldo(getSaldo() - v);
				System.out.println("Deposito realizado na conta de: " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque!");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada!");
		}
	}

	public void pagarMensal() {
		float v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}

		if (this.getStatus()) {
			setSaldo(getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada!");
		}

	}
}
