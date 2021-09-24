package modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import modelEntity.Estudiante;

public interface IEstudianteDAO extends JpaRepository<Estudiante, Long> {

}
