package modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Spring.modelEntity.Estudiante;

public interface IEstudianteDAO extends JpaRepository<Estudiante, Long> {

}
