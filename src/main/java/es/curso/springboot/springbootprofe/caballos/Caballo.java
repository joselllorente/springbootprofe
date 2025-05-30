package es.curso.springboot.springbootprofe.caballos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="TB_CABALLO")
public class Caballo {

	@Id
	private int id;
	@Value("Trueno")
	private String nombre;
	private int edad;
	private double velocidadMaxima;
	private int numeroTriunfos;
	private double experiencia;
	
	public Caballo(String nombre, int edad, double velocidadMaxima, int numeroTriunfos, double experiencia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.numeroTriunfos = numeroTriunfos;
		this.experiencia = experiencia;
	}
	public Caballo() {
		super();
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
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getNumeroTriunfos() {
		return numeroTriunfos;
	}
	public void setNumeroTriunfos(int numeroTriunfos) {
		this.numeroTriunfos = numeroTriunfos;
	}
	public double getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}
	
	
}
