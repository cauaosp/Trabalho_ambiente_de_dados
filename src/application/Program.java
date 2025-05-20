package application;

import java.util.Scanner;

import entities.Aluno;
import model.dao.AlunoDao;
import model.dao.AlunoFactory;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	  AlunoDao alunodao = AlunoFactory.createAlunoDao();
	  
	 Scanner sc = new Scanner(System.in); 
	 
	// test 1 insert de aluno no banco de dados 
	 Aluno aluno = new Aluno(4488,"eric",8,7,5,5.0,"reprovado"); 
	 alunodao.insert(aluno);
	 
	 
	// test 2 deletando aluno do banco de dados
	  alunodao.deleteById(4488);

	 
	 
	  
		
	}

}
