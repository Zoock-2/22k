package br.com.projeto22k.model;

public class Aluno {
	private int rgm;
	private String nome;
	private String email;
	private String dtaNascimento;
	private String rua;
	private int uf;
	private String municipio;
	private String Telefone;
	private String cpf;
	private  int curso;
	private int periodo;
	private int Turma;
	private int campus;
	private String cep;
	private String numero;
	private String complemento;
	private int semestre;
	
	

	// construtor vazio
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public Aluno(int rgm, String nome, String email, String dtaNascimento, String rua, int uf, String municipio,
			String telefone, String cpf, int curso, int periodo, int turma, int campus, String cep, String numero,
			String complemento, int semestre) {
		super();
		this.rgm = rgm;
		this.nome = nome;
		this.email = email;
		this.dtaNascimento = dtaNascimento;
		this.rua = rua;
		this.uf = uf;
		this.municipio = municipio;
		this.Telefone = telefone;
		this.cpf = cpf;
		this.curso = curso;
		this.periodo = periodo;
		this.Turma = turma;
		this.campus = campus;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.semestre = semestre;
	}


	public int getRgm() {
		return rgm;
	}



	public void setRgm(int rgm) {
		this.rgm = rgm;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDtaNascimento() {
		return dtaNascimento;
	}



	public void setDtaNascimento(String dtaNascimento) {
		this.dtaNascimento = dtaNascimento;
	}



	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public int getUf() {
		return uf;
	}



	public void setUf(int uf) {
		this.uf = uf;
	}



	public String getMunicipio() {
		return municipio;
	}



	public void setMunicipio(String string) {
		this.municipio = string;
	}



	public String getTelefone() {
		return Telefone;
	}



	public void setTelefone(String telefone) {
		Telefone = telefone;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public int getCurso() {
		return curso;
	}



	public void setCurso(int curso) {
		this.curso = curso;
	}



	public int getPeriodo() {
		return periodo;
	}



	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}



	public int getTurma() {
		return Turma;
	}



	public void setTurma(int turma) {
		Turma = turma;
	}



	public int getCampus() {
		return campus;
	}



	public void setCampus(int campus) {
		this.campus = campus;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getComplemento() {
		return complemento;
	}



	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}



	public int getSemestre() {
		return semestre;
	}



	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}}









