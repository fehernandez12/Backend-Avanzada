package personaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.Spring.modelEntity.Persona;
import modelsDAO.IPersonaDAO;

@Service
public class PersonaService implements IPersonaService {
	
	@Autowired
	private IPersonaDAO personaDao;

	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return personaDao.findAll();
	}

	@Override
	public Persona save(Persona e) {
		// TODO Auto-generated method stub
		return personaDao.save(e);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		personaDao.deleteById(id);
	}

	@Override
	public Persona findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
