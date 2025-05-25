package application;

import java.sql.Date;

import entities.Alunos;
import entities.Livros;
import model.dao.AlunoDao;
import model.dao.AlunoFactory;
import model.dao.LivroDao;
import model.dao.LivroFactory;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AlunoDao alunodao = AlunoFactory.createAlunoDao();
		
		//Alunos aluno1 = new Alunos("eric","455264", new Date(0));
        //alunodao.insert(aluno1);
		
        
        
		LivroDao livrodao = LivroFactory.createLivroDao();
		//Livros livro1 = new Livros("o rei do cu","jeremias",new Date(0));
        //livrodao.insert(livro1);	
	
	
        livrodao.deleteById(2);
	
	}

}
