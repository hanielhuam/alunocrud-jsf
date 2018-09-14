package br.com.hanieligor.alunocrud.controller;

import javax.faces.bean.ManagedBean;

import br.com.hanieligor.alunocrud.service.AlunoService;

@ManagedBean
public class AlunoBean {
	private AlunoService alunoService;

	public AlunoBean(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
}
