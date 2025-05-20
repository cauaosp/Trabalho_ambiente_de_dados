package model.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import entities.Aluno;
import model.dao.AlunoDao;

public class AlunoDaoJdbc implements AlunoDao {

	private Connection conn = null;

	public AlunoDaoJdbc(Connection connection) {
		this.conn = connection;
	}

	@Override
	public void insert(Aluno obj) {
		// TODO Auto-generated method stub

		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"insert into aluno(matricula,nome,nota1,nota2,nota3,media,status) " + "values(?,?,?,?,?,?,?) ");

			st.setInt(1, obj.getMatricula());
			st.setString(2, obj.getName());
			st.setInt(3, obj.getNota1());
			st.setInt(4, obj.getNota2());
			st.setInt(5, obj.getNota3());
			st.setDouble(6, obj.calcularMedia());
			st.setString(7, obj.getStatus());

		

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
	public void update(Aluno obj) {
		// TODO Auto-generated method stub
		
		

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("delete from aluno " + "where matricula = ?");

			st.setInt(1, id);
			
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
	public void findById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Aluno> findALL() {
		// TODO Auto-generated method stub
		return null;
	}

}
