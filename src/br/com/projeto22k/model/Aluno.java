package br.com.projeto22k.model;
import java.util.ArrayList;

public class Aluno {
	private int rgm;
	private String nome;
	private String email;
	private String dtaNascimento;
	private String rua;
	private String uf;
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
	private int disciplina;
	private Object Presenca;
	private Object dta;
 
	

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



	public String getUf() {
		return uf;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}



	public String getMunicipio() {
		return municipio;
	}



	public void setMunicipio(String municipio) {
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
	}



	public int getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(int disciplina) {
		this.disciplina = disciplina;
	}



	public Object getPresenca() {
		return Presenca;
	}



	public void setPresenca(ArrayList<String> presenca) {
		this.Presenca = presenca;
	}



	public Object getDta() {
		return dta;
	}



	public void setDta(ArrayList<String> dta) {
		this.dta = dta;
	}



	public Aluno(int rgm, String nome, String email, String dtaNascimento, String rua, String uf, String municipio,
			String telefone, String cpf, int curso, int periodo, int turma, int campus, String cep, String numero,
			String complemento, int semestre, int disciplina, ArrayList<String> presenca, ArrayList<String> dta) {
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
		this.disciplina = disciplina;
		this.Presenca = presenca;
		this.dta = dta;
	}



	// construtor vazio
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
}



	





