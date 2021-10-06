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

import Backend.Spring.estudianteService.IEstudianteService;
import Backend.Spring.modelEntity.Estudiante;


@RestController
@RequestMapping("/api")
public class EstudianteController {
	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping("/estudiantes")
	public List<Estudiante> listAll(){
		return estudianteService.findAll();
	};
	@PostMapping("/estudiantes")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiante save(@RequestBody Estudiante e) {
		return estudianteService.save(e);
	}
	@DeleteMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id) {
		estudianteService.delete(id);
	}
	@GetMapping("/estudiantes/{id}")
	public Estudiante findById(@PathVariable long id) {
		return estudianteService.findById(id);
	}
	@PutMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Estudiante update(@PathVariable long id, @RequestBody Estudiante e) {
		Estudiante actual = estudianteService.findById(id);
		actual.setNombre(e.getNombre());
		actual.setApellido(e.getApellido());
		actual.setCarrera(e.getCarrera());
		actual.setNota(e.getNota());
		return estudianteService.save(actual);
	}
}
