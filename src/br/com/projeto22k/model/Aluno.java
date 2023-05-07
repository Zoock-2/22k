package br.com.projeto22k.model;

public class Aluno {
	private int rgm;
	private String nome;
	private String email;
	private String dtaNascimento;
	private String endereco;
	private int uf;
	private int municipio;
	private String Telefone;
	private String cpf;
	private  int curso;
	private int campus;
	private int periodo;
	private String rua;
	private String cep;
	private String complemento;
	private String numero;
	private int Turma;
	
	

	// construtor vazio
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	// construtor com campos



	public Aluno(int rgm, String nome, String email, String dtaNascimento, String endereco, int uf, int municipio,
			String telefone, String cpf, int curso, int campus, int periodo, String rua, String cep, String complemento,
			String numero, int turma) {
		super();
		this.rgm = rgm;
		this.nome = nome;
		this.email = email;
		this.dtaNascimento = dtaNascimento;
		this.endereco = endereco;
		this.uf = uf;
		this.municipio = municipio;
		this.Telefone = telefone;
		this.cpf = cpf;
		this.curso = curso;
		this.campus = campus;
		this.periodo = periodo;
		this.rua = rua;
		this.cep = cep;
		this.complemento = complemento;
		this.numero = numero;
		this.Turma = turma;
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



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public int getUf() {
		return uf;
	}



	public void setUf(int uf) {
		this.uf = uf;
	}



	public int getMunicipio() {
		return municipio;
	}



	public void setMunicipio(int municipio) {
		this.municipio = municipio;
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



	public int getCampus() {
		return campus;
	}



	public void setCampus(int campus) {
		this.campus = campus;
	}



	public int getPeriodo() {
		return periodo;
	}



	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}



	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getComplemento() {
		return complemento;
	}



	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public int getTurma() {
		return Turma;
	}



	public void setTurma(int turma) {
		Turma = turma;
	}






}	