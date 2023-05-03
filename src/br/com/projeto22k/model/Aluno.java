package br.com.projeto22k.model;

public class Aluno {
	private int rgm;
	private String nome;
	private String email;
	private String dtaNascimento;
	private int idade ;
	private String endereco;
	private int Uf;
	private int Municipio;
	private String Telefone;
	private String cpf;
	private  int curso;
	private int campus;
	private int periodo;
	

	// construtor vazio
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	// construtor com campos


	public Aluno(int rgm, String nome, String email, String dtaNascimento, int idade, String endereco, int uf,
			int municipio, String telefone, String cpf, int curso, int campus, int periodo) {
		super();
		this.rgm = rgm;
		this.nome = nome;
		this.email = email;
		this.dtaNascimento = dtaNascimento;
		this.idade = idade;
		this.endereco = endereco;
		Uf = uf;
		Municipio = municipio;
		Telefone = telefone;
		this.cpf = cpf;
		this.curso = curso;
		this.campus = campus;
		this.periodo = periodo;
	}


	public Aluno(int ca, String nome2, String email2, String nascimento, int idade2, String endereco2) {
		// TODO Auto-generated constructor stub
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


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getUf() {
		return Uf;
	}


	public void setUf(int uf) {
		Uf = uf;
	}


	public int getMunicipio() {
		return Municipio;
	}


	public void setMunicipio(int municipio) {
		Municipio = municipio;
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
	
	
	
}
