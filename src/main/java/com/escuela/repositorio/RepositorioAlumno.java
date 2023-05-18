package com.escuela.repositorio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.escuela.modelo.Alumno;
// delete class
@Repository
		public interface RepositorioAlumno extends JpaRepository<Alumno, Long> {
		List<Alumno> findByNombre(@Param("nombre") String nombre);		
	}
