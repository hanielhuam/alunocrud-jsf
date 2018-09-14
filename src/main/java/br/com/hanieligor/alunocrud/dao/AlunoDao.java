package br.com.hanieligor.alunocrud.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.hanieligor.alunocrud.model.Aluno;

public class AlunoDao {
	private List<Aluno> listaAluno;
	
	public AlunoDao() {
		listaAluno = new ArrayList<Aluno>();
	}
	
	public void insert(Aluno aluno) {
		listaAluno.add(aluno);
	}
	
	public Aluno find(Aluno aluno) {
		if (listaAluno.contains(aluno)) 
			return listaAluno.get(listaAluno.indexOf(aluno));
		return null;
	}
	
	
	public void update(Aluno alunoOld, Aluno alunoNew) {
		listaAluno.remove(alunoOld);
		listaAluno.add(alunoNew);
	}
	
	public void delete(Aluno aluno) {
		listaAluno.remove(aluno);
	}
	
}
