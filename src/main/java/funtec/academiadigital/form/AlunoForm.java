package funtec.academiadigital.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class AlunoForm {
	@Data
	@NoArgsConstructor
	@AllArgsConstructor 
	 
	public class AvaliacaoFisicaForm {      
		
		private Long alunoId; 
	}
	 
	private double peso; 
	private double altura;
}
