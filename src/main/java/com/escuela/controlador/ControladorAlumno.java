package com.escuela.controlador;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//modificamos para que sean nuestros modelos
import com.escuela.modelo.Alumno;
import com.escuela.repositorio.RepositorioAlumno;

//ponemos nuestars anotaciones
@RestController
@RequestMapping("/api")
public class ControladorAlumno {

	@Autowired
	private RepositorioAlumno repository;
	
	
	@GetMapping("/alumno")
	public List<Alumno> allAlumno(){
		System.out.print("aaaaaaaa");
		return  repository.findAll();
	}
	
	@GetMapping("/alumno/{nombre}")
	public List<Alumno> findByNombre(@PathVariable("nombre") String nombre) {
		return repository.findByNombre(nombre);
	}
	
	@PostMapping("/alumno")
	public Alumno createAlumno(@RequestBody Alumno Alumno) {
		return repository.save(Alumno);
	}
	
	@PutMapping("/alumno/{id}")
	public Alumno updateAlumno(@PathVariable int id ,@RequestBody Alumno Alumno) {
		return repository.save(Alumno);
	}
	
	@DeleteMapping("/Alumno/{id}")
	public void deleteAlumnos(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
	
	
	
}

