package es.curso.springboot.springbootprofe.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	@Autowired
	private LogService log;
	
	public int ejecutaOperacion (int num1, int num2, String operacion){
		
		int resultado = 0;
		if(operacion.equals("suma")) {
			resultado = num1+num2;
		}else if(operacion.equals("resta")) {
			resultado = num1-num2;
		}
		log.pintarLog("El resultado de ejecutar "+ resultado);
		return resultado;
	}
	
}
