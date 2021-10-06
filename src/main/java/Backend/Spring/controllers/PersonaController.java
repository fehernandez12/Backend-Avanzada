package Backend.Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Backend.Spring.modelEntity.Persona;
import Backend.Spring.personaService.IPersonaService;


@RestController
@RequestMapping("/api")
public class PersonaController {
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping("/personas")
	public List<Persona> listarPersonas(){
		return personaService.findAll();
	};
	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona save(Persona e) {
		return personaService.save(e);
	}
	@DeleteMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id) {
		personaService.delete(id);
	}
	@GetMapping("/personas/{id}")
	public Persona findById(@PathVariable long id) {
		return personaService.findById(id);
	}
	@PutMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Persona update(@PathVariable long id, @RequestBody Persona e) {
		Persona actual = personaService.findById(id);
		actual.setNombre(e.getNombre());
		actual.setApellido(e.getApellido());
		return personaService.save(actual);
	}
}
