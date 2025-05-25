package model.dao;

import java.util.List;

import entities.Alunos;

public interface AlunoDao {
	
	  void insert(Alunos obj);
      void update(Alunos obj);
      void deleteByMatricula(String matricula);
      void findByStatus(String status);
      List<Alunos> findALL();
	
}
