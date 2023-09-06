package funtec.academiadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import funtec.academiadigital.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
