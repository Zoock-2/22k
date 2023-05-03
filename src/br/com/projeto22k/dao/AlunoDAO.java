package br.com.projeto22k.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto22k.model.Aluno;
import br.com.projeto22k.util.ConnectionFactory;

public class AlunoDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs; 
	private Aluno aluno;

	public AlunoDAO() throws Exception {
		// chama a classe ConnectionFactory e estabele uma conexão
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}

	// método de salvar

	public void salvar(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "INSERT INTO "
					+ "Cadaluno (RGM, "
					+ "Nome, eMail, "
					+ "DataNascimento, "
					+ "Idade,Endereco) "
					+ "values (?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRgm());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.setString(4, aluno.getDtaNascimento());
			ps.setInt(5, aluno.getIdade());
			ps.setString(6, aluno.getEndereco());
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
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "UPDATE Cadaluno set  Nome=?, "
					+ "eMail=?, DataNascimento=?, "
					+ "Idade=?, Endereco=? "
					+ "Uf=?"
					+ "Municipio=?,"
					+"telefone=?,"
					+ "Cpf=?,"
					+ "Curso=?,"
					+ "Periodo=?,"
					+ "Campus=?,"
					+ "WHERE rgm = ?,";
					
					
			ps = conn.prepareStatement(SQL);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getEmail());
			ps.setString(3, aluno.getDtaNascimento());
			ps.setInt(4, aluno.getIdade());
			ps.setString(5, aluno.getEndereco());
			ps.setInt(6, aluno.getUf());
			ps.setInt(7, aluno.getMunicipio());
			ps.setString(8, aluno.getTelefone());
			ps.setString(9,  aluno.getCpf());
			ps.setInt(10, aluno.getCurso());
			ps.setInt(11, aluno.getPeriodo());
			ps.setInt(12, aluno.getCampus());
			ps.setInt(13, aluno.getRgm());
			
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
			throw new Exception("O valor passado nao pode ser nulo");
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
				int ca = rs.getInt(1);
				String nome = rs.getString(2);
				String email = rs.getString(3);
				String nascimento = rs.getString(4);
				int idade = rs.getInt(5);
				String endereco = rs.getString(6);
				aluno = new Aluno(ca, nome, email, nascimento, idade, endereco);
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
				int ca = rs.getInt(1);
				String nome = rs.getString(2);
				String email = rs.getString(3);
				String nascimento = rs.getString(4);
				int idade = rs.getInt(5);
				String endereco = rs.getString(6);
				list.add(new Aluno(ca, nome, email, nascimento, idade, endereco));
			}
			return list;
		} catch (SQLException sqle) {
			throw new Exception(sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
	}
}


