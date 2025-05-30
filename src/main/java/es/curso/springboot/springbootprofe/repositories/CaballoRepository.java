package es.curso.springboot.springbootprofe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.springboot.springbootprofe.caballos.Caballo;

public interface CaballoRepository extends JpaRepository<Caballo, Integer>{

}
