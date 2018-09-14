package br.com.hanieligor.alunocrud.service;

import br.com.hanieligor.alunocrud.dao.AlunoDao;
import br.com.hanieligor.alunocrud.model.Aluno;

public class AlunoService {
	private AlunoDao alunoDao;
	
	public AlunoService(AlunoDao alunoDao) {
		this.alunoDao = alunoDao;
	}
	
	public void insert(Aluno aluno) {
		alunoDao.insert(aluno);
	}
	
	public Aluno find(Aluno aluno) {
		return alunoDao.find(aluno);
	}
	
	public void update(Aluno alunoOld, Aluno alunoNew) {
		alunoDao.update(alunoOld, alunoNew);
	}
	
	public void delete(Aluno aluno) {
		alunoDao.delete(aluno);
	}
}
