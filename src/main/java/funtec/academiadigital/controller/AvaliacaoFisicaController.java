package funtec.academiadigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import funtec.academiadigital.entity.AvaliacaoFisica;
import funtec.academiadigital.form.AlunoForm.AvaliacaoFisicaForm;
import funtec.academiadigital.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping ("/avaliacoes")
public class AvaliacaoFisicaController {

	@Autowired
	private AvaliacaoFisicaServiceImpl service;
	 
	@PostMapping   
	public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {      
		return service.create(form);    
		}  
}
