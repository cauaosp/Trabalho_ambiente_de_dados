package model.dao;

import java.util.List;

import entities.Aluno;

public interface AlunoDao {
	
	  void insert(Aluno obj);
      void update(Aluno obj);
      void deleteById(Integer id);
      void findById(Integer id);
      List<Aluno> findALL();
}
