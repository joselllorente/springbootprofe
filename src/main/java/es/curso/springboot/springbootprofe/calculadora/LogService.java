package es.curso.springboot.springbootprofe.calculadora;

import org.springframework.stereotype.Service;

@Service
public class LogService {

	public void pintarLog(String mensaje) {
		System.out.println(mensaje);
	}
	
}
