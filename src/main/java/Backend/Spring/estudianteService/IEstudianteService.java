package Backend.Spring.estudianteService;

import java.util.List;

import Backend.Spring.modelEntity.Estudiante;

public interface IEstudianteService {

	public List<Estudiante> findAll();

	public Estudiante save(Estudiante e);

	public void delete(long id);

	public Estudiante findById(long id);

}
