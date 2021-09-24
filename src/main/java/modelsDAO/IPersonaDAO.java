package modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import modelEntity.Persona;

public interface IPersonaDAO extends JpaRepository<Persona, Long> {

}
