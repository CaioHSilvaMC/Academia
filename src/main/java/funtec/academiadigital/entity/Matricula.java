package funtec.academiadigital.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Entity
@Table(name = "tb_matriculas")
public class Matricula {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	@JoinColumn (name = "aluno_id")
	private Aluno aluno;
	private Date dataDaMatricula;
}
