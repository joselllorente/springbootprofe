package es.curso.springboot.springbootprofe.formularios;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Usuario {
	//@Value("Juan")
    private String nombre;
	//@Value("22")
    private int edad;
    
    public Usuario() {
		super();
	}

    public Usuario(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

    
    
}