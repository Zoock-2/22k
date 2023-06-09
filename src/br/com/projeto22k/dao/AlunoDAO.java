package br.com.projeto22k.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto22k.model.Aluno;
import br.com.projeto22k.model.AlunoNota;
import br.com.projeto22k.util.ConnectionFactory;

public class AlunoDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs; 
	private Aluno aluno;
	private AlunoNota alunonota;

	public AlunoDAO() throws Exception {
		// chama a classe ConnectionFactory e estabele uma conexão
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}

	
		
	
	
	public void setNotas(int rgm,AlunoNota aluno) throws Exception  {
		
		try {
		String SQL ="update Notas set a1=?,"
				+ "a2=?,"
				+ "af=?"
				+ "where rgm=?";
		ps = conn.prepareStatement(SQL);
		ps.setFloat(1, aluno.getA1());
		ps.setFloat(2, aluno.getA2());
		ps.setFloat(3, aluno.getAf());
		ps.setInt(4, rgm);
		ps.executeUpdate();
	
	}catch (SQLException sqle) {
		throw new Exception("Erro ao alterar dados " + sqle);
	}finally {
		ConnectionFactory.closeConnection(conn, ps);
	}
}
	// método de salvar
	public void alunopresenca(String presenca ,String data,int rgm, int disciplina, int curso) throws Exception {
		
		try{
			String SQL = "INSERT INTO Presença (presenca,"
				+ "data,"
				+ "Rgm,"
				+ "disciplina,"
				+ "curso) "
				+ "values (?, ? ,? ,?, ?)";
		ps = conn.prepareStatement(SQL);
		ps.setString(1, presenca);
		ps.setString(2, data);
		ps.setInt(3,rgm);
		ps.setInt(4,disciplina);
		ps.setInt(5, curso);
		ps.executeUpdate();
		}catch (SQLException sqle) {
			throw new Exception("Erro ao alterar dados " + sqle);
		}finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
		
	}
	public void salvar(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "INSERT INTO "
					+ "Cadaluno (RGM, "
					+ "Nome, eMail, "
					+ "DataNascimento, "
					+ "Rua,Uf,"
					+ "Municipio, telefone,"
					+ "Cpf, Curso,"
					+ "Periodo, Turma,"
					+ "Campus, cep,"
					+ "Num, Complemento,"
					+ "disp) "
					+ "values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRgm());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.setString(4, aluno.getDtaNascimento());
			ps.setString(5, aluno.getRua());
			ps.setString(6, aluno.getUf());
			ps.setString(7, aluno.getMunicipio());
			ps.setString(8, aluno.getTelefone());
			ps.setString(9, aluno.getCpf());
			ps.setInt(10,aluno.getCurso());
			ps.setInt(11, aluno.getPeriodo());
			ps.setInt(12, aluno.getTurma());
			ps.setInt(13, aluno.getCampus());
			ps.setString(14, aluno.getCep());
			ps.setString(15, aluno.getNumero());
			ps.setString(16, aluno.getComplemento());
			ps.setInt(17, aluno.getDisciplina());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao inserir dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	// método de atualizar

	public void atualizar(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo.");
		try {
			String SQL = "UPDATE Cadaluno set  Nome=?, "
					+ "eMail=?, DataNascimento=?, "
					+ "Rua=?, Uf=?, "
					+ "Municipio=?,"
					+ "telefone=?,"
					+ "Cpf=?,"
					+ "Curso=?,"
					+ "Periodo=?,"
					+ "Turma=?,"
					+ "Campus=?,"
					+ "cep=?,"
					+ "Num=?,"
					+ "Complemento=?,"
					+ "disp=? "
					+ "WHERE rgm = ?;";
					
					
			ps = conn.prepareStatement(SQL);
			
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getEmail());
			ps.setString(3, aluno.getDtaNascimento());
			ps.setString(4, aluno.getRua());
			ps.setString(5, aluno.getUf());
			ps.setString(6, aluno.getMunicipio());
			ps.setString(7, aluno.getTelefone());
			ps.setString(8, aluno.getCpf());
			ps.setInt(9,aluno.getCurso());
			ps.setInt(10, aluno.getPeriodo());
			ps.setInt(11, aluno.getTurma());
			ps.setInt(12, aluno.getCampus());
			ps.setString(13, aluno.getCep());
			ps.setString(14, aluno.getNumero());
			ps.setString(15, aluno.getComplemento());
			ps.setInt(16, aluno.getDisciplina());
			ps.setInt(17, aluno.getRgm());
			
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao alterar dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	// método de excluir

	public void excluir(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo.");
		try {
			String SQL = "DELETE FROM Cadaluno"
					+ " WHERE rgm = ?";
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRgm());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao excluir dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}

	// Procurar Aluno

	public Aluno procurarAluno(int rgm) throws Exception {

		try {
			String SQL = "SELECT  * FROM Cadaluno WHERE RGM=?";
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, rgm);			
			rs = ps.executeQuery();
			if (rs.next()) {
				String nome = rs.getString(2);
				String email = rs.getString(3);
				String dtaNascimento = rs.getString(4);
				String rua = rs.getString(5);
				String uf = rs.getString(6);
				String municipio = rs.getString(7);
				String telefone = rs.getString(8);
				String cpf = rs.getString(9);
				int curso = rs.getInt(10);
				int periodo = rs.getInt(11);
				int turma = rs.getInt(12);
				int campus = rs.getInt(13);
				String cep = rs.getString(14);
				String numero = rs.getString(16);
				String complemento = rs.getString(15);
				int disciplina =rs.getInt(17);
				aluno = new Aluno(rgm,nome,email,dtaNascimento,rua,uf,municipio,telefone,cpf,curso,periodo,turma,campus,cep,numero,complemento,disciplina);
			}
			return aluno;
		} catch (SQLException sqle) {
			throw new Exception(sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
	}
// Listar todos os alunos

	public List todosAlunos() throws Exception {
		try {
			conn = this.conn;
			ps = conn.prepareStatement("SELECT * FROM Cadaluno");
			rs = ps.executeQuery();
			List<Aluno> list = new ArrayList<Aluno>();
			while (rs.next()) {
				int rgm = rs.getInt(1);
				String nome = rs.getString(2);
				String email = rs.getString(3);
				String dtaNascimento = rs.getString(4);
				String rua = rs.getString(5);
				String uf = rs.getString(6);
				String municipio = rs.getString(7);
				String telefone = rs.getString(8);
				String cpf = rs.getString(9);
				int curso = rs.getInt(10);
				int periodo = rs.getInt(11);
				int turma = rs.getInt(12);
				int campus = rs.getInt(13);
				String cep = rs.getString(14);
				String numero = rs.getString(16);
				String complemento = rs.getString(15);
				int disciplina = rs.getInt(17);
				aluno = new Aluno(rgm,nome,email,dtaNascimento,rua,uf,municipio,telefone,cpf,curso,periodo,turma,campus,cep,numero,complemento,disciplina);
			}
			return list;
		} catch (SQLException sqle) {
			throw new Exception(sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
		
	}
	//metodo presença

	public AlunoNota pushNotas(int rgm) throws Exception {
		
		try {
			String SQL ="SELECT a1,a2,af FROM Notas where rGM = ?";
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, rgm);			
			rs = ps.executeQuery();
			while (rs.next()) {
				float a1 = rs.getFloat(1);
				float a2 = rs.getFloat(2);
				float af = rs.getFloat(3);
				AlunoNota alunonota = new AlunoNota(a1,a2,af);
			}
			return alunonota;
		} catch (SQLException sqle) {
			throw new Exception(sqle);
		} 
}

}


