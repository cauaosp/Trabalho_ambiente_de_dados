package model.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import entities.Alunos;
import model.dao.AlunoDao;

public class AlunoDaoJdbc implements AlunoDao {

	private Connection conn = null;

	public AlunoDaoJdbc(Connection connection) {
		this.conn = connection;
	}

	@Override
	public void insert(Alunos obj) {
		// TODO Auto-generated method stub

	   // media e status não serão permitidos inserts pelo usuário.
		//matricula permitida insert pelo usuário para facilitar teste do trabalho.
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"insert into alunos(nome,matricula,data_nascimento) "
			+ "values(?,?,?) ", Statement.RETURN_GENERATED_KEYS );

		   
			st.setString(1,obj.getNome());
			st.setString(2, obj.getMatricula());
			st.setDate(3, new java.sql.Date(obj.getDataNascimento().getTime()));
		

			int rowsaffected = st.executeUpdate();

			if (rowsaffected > 0) {
				System.out.println("linhas afetadas = " + rowsaffected);
			} else {
				throw new DbException("no rows affecteds");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());

		}
		finally {
		 DB.closeStatment(st);
		}

	}

	@Override
	public void update(Alunos obj) {
		// TODO Auto-generated method stub
		PreparedStatement st = null; 
		
		//update somente permitidos a notas de alunos, não se troca matricula,nome,media,status.
		try {
			st = conn.prepareStatement(
					"update alunos " +
		             "set nome = ?,matricula = ?,data_nascimento = ? " +
					 "where id_aluno = ?");
			
			
			st.setString(1, obj.getNome());
			st.setString(2, obj.getMatricula());
			st.setDate(3,new java.sql.Date(obj.getDataNascimento().getTime()));
			
			st.executeUpdate();
			
		}catch(SQLException e) {
			 throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatment(st);
		}

	}

	@Override
	public void deleteByMatricula(String matricula) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("delete from aluno " + "where matricula = ?");

			st.setString(1, matricula);
			
			int rowsaffected = st.executeUpdate();

			if (rowsaffected > 0) {
				System.out.println("linhas afetadas = " + rowsaffected);
			} else {
				throw new DbException("no rows affecteds");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatment(st);
		}

	}

	@Override
	public void findByStatus(String status) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Alunos> findALL() {
		// TODO Auto-generated method stub
		return null;
	}

}
