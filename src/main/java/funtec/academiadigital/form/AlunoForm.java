package funtec.academiadigital.form;

import java.sql.Date;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class AlunoForm {
	@Data
	@NoArgsConstructor
	@AllArgsConstructor 
	 
	public class AvaliacaoFisicaForm {      
		
		private Long alunoId; 
		private double peso; 
		private double altura;
	}
	
	private String nome;
	@Column(unique = true)
	private String cpf;
	private String bairro;
	private Date dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	 @NotEmpty
	 (message = "Preencha o campo corretamente.")   
	 @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")   
	 private String Nome; 
	 
	  @NotEmpty
	  (message = "Preencha o campo corretamente.")   
	  @CPF(message = "'${validatedValue}' é inválido!")   
	  private String Cpf; 
	 
	  @NotEmpty
	  (message = "Preencha o campo corretamente.")   
	  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")   
	  private String Bairro; 
}
