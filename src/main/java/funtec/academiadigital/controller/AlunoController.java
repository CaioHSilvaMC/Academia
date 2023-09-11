package funtec.academiadigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import funtec.academiadigital.entity.Aluno;
import funtec.academiadigital.form.AlunoForm;
import funtec.academiadigital.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping ("/alunos")
public class AlunoController {

	@Autowired
	private AlunoServiceImpl service; 
	
	 @PostMapping   
	 public Aluno create(@RequestBody AlunoForm form) {     
		 return service.create(form);   
	 }
	 
	 @GetMapping
	 public List<Aluno> getAll(@RequestParam(value = "dataNascimento", required = false)String dataNacimento){     
		 return service.getAll();   
	 }
	  
}
