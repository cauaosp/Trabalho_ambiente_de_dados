package application;

import java.sql.Date;

import entities.Alunos;
import model.dao.AlunoDao;
import model.dao.AlunoFactory;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoDao alunodao = AlunoFactory.createAlunoDao();
		
		Alunos aluno1 = new Alunos("eric","455264", new Date(0));
        alunodao.insert(aluno1);
		
		
	}

}
