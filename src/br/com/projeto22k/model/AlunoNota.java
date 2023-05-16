package br.com.projeto22k.model;

public class AlunoNota {
	public AlunoNota() {
		// TODO Auto-generated constructor stub
	}

	public AlunoNota(float a1, float a2, float af) {
		
		this.a1 = a1;
		this.a2 = a2;
		this.af = af;
	}
	public float a1;
	public float a2;
	public float af;
	public float getA1() {
		return a1;
	}

	public void setA1(float a1) {
		this.a1 = a1;
	}

	public float getA2() {
		return a2;
	}

	public void setA2(float a2) {
		this.a2 = a2;
	}

	public float getAf() {
		return af;
	}

	public void setAf(float af) {
		this.af = af;
	}
}
