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
	 
	 //test 1 insert de aluno no banco de dados 
	 Aluno aluno = new Aluno(4452,"eric",8,7,5,0.0,"reprovado");
	 alunodao.insert(aluno);
	 System.out.println(aluno);
	 Aluno aluno2 = new Aluno(4452,"lyra",9,4,6,0.0,"reprovado");
	 aluno.calcularMedia();
	 alunodao.insert(aluno2);
	 Aluno aluno3= new Aluno(4453,"caua",10,3,2,0.0,"reprovado"); 
	 alunodao.insert(aluno3);
	 Aluno aluno4 = new Aluno(4454,"pedro",4,5,6,0.0,"reprovado");
	 alunodao.insert(aluno4);
	 Aluno aluno5 = new Aluno(4455,"alexandre",7,7,2,0.0,"reprovado");
	 alunodao.insert(aluno5);
	 Aluno aluno6 = new Aluno(4456,"henrique",9,7,2,0.0,"reprovado");
	 alunodao.insert(aluno6);
	 Aluno aluno7 = new Aluno(4457,"otavio",2,4,6,0.0,"reprovado");
	 alunodao.insert(aluno7);
	 Aluno aluno8 = new Aluno(4458,"lidiane",1,5,7,0.0,"reprovado");
	 alunodao.insert(aluno8);
	 Aluno aluno9 = new Aluno(4459,"adriele",2,5,8,0.0,"reprovado");
	 alunodao.insert(aluno9);
	 Aluno aluno10 = new Aluno(4460,"bruno",9,4,8,0.0,"reprovado");
	 alunodao.insert(aluno10);
	 
	 
	//test 2 deletando aluno do banco de dados
	 System.out.println("inserir metricula para deletar: ");
	 int delete = sc.nextInt();
	  alunodao.deleteById(delete);

	 
	 
	  
		
	}

}
