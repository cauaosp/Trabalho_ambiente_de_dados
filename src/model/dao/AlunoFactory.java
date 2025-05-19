package model.dao;

import db.DB;
import model.dao.jdbc.AlunoDaoJdbc;

public class AlunoFactory {
	
	public static AlunoDao createAlunoDao() {
		return new AlunoDaoJdbc(DB.getConnection());
	}

}
