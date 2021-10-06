package Backend.Spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Spring.modelEntity.Persona;

public interface IPersonaDAO extends JpaRepository<Persona, Long> {

}
