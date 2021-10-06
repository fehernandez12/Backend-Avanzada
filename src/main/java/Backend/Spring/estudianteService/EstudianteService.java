package Backend.Spring.estudianteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.Spring.modelEntity.Estudiante;
import Backend.Spring.modelsDAO.IEstudianteDAO;

@Service
public class EstudianteService implements IEstudianteService {
	
	@Autowired
	private IEstudianteDAO estudianteDao;

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return estudianteDao.findAll();
	}

	@Override
	public Estudiante save(Estudiante e) {
		// TODO Auto-generated method stub
		return estudianteDao.save(e);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		estudianteDao.deleteById(id);
	}

	@Override
	public Estudiante findById(long id) {
		// TODO Auto-generated method stub
		return estudianteDao.getById(id).orElse(null);
	}

}
