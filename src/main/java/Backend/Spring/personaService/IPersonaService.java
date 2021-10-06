package Backend.Spring.personaService;

import java.util.List;

import Backend.Spring.modelEntity.Persona;

public interface IPersonaService {
	public List<Persona> findAll();

	public Persona save(Persona e);

	public void delete(long id);

	public Persona findById(long id);
}
