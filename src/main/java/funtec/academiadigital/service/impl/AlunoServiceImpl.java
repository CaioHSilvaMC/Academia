package funtec.academiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import funtec.academiadigital.entity.Aluno;
import funtec.academiadigital.form.AlunoForm;
import funtec.academiadigital.repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements IAlunosService{
	
	@Autowired
	private AlunoRepository repository;

	@Override  public Aluno create(AlunoForm form) {    
		return null;  
	} 
	 
	 @Override  public Aluno get(Long id) {    
		 return null;  
	 } 
	 
	 @Override  public List<Aluno> getAll() {     
		 return repository.findAll();  
	 } 
	 
	 @Override  public Aluno update (Long id) {    
		 return null;  
	 } 
	 
	 @Override  public void delete(Long id) {      
		 
	 }
}
