package estudianteService;

import java.util.List;

import Backend.Spring.modelEntity.Estudiante;

public interface IEstudianteService {

	List<Estudiante> findAll();

	Estudiante save(Estudiante e);

	void delete(long id);

	Estudiante findById(long id);

}