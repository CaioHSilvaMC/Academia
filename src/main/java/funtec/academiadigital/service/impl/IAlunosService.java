package funtec.academiadigital.service.impl;

import java.util.List;

import funtec.academiadigital.entity.Aluno;
import funtec.academiadigital.form.AlunoForm;

public interface IAlunosService {

	public Aluno create(AlunoForm form);
	public Aluno get(Long id);
	public List<Aluno> getAll();
	public Aluno update(Long id);
	public void delete(Long id);
	
}
