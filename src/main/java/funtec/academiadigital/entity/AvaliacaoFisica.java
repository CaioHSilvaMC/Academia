package funtec.academiadigital.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Entity
@Table(name = "tb_avaliacoes") 
public class AvaliacaoFisica {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn (name = "aluno_id")
	private Aluno aluno;
	private Date dataDaAvaliacao;
	@Column
	private double peso;
	@Column
	private double altura;
}
