package es.curso.springboot.springbootprofe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.springboot.springbootprofe.caballos.Caballo;

public interface CaballoRepository extends JpaRepository<Caballo, Integer>{

	
	public List<Caballo> findByNombreStartsWithIgnoreCase(String nombre);
	
}
