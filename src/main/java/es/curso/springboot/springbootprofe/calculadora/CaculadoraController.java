package es.curso.springboot.springbootprofe.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculadora")
public class CaculadoraController {

	@Autowired
	private CalculadoraService servicio;
	
	//@RequestMapping(value="/calculadora", method=RequestMethod.GET)
	@GetMapping(value="")
	public String inicio() {
		
		return "calculadora";
	}
	
	@GetMapping(value="/operar")
	public String operar(Model model, 
			@RequestParam("num1") int numero1,
			@RequestParam("num2") int numero2,
			@RequestParam("operacion") String operacion) {
		
		System.out.println("operar "+ numero1 + ", "+ numero2 + ", " +operacion);
		
		
		//servicio = new CalculadoraService();
		int resultado = servicio.ejecutaOperacion(numero1, numero2, operacion);
		System.out.println("resultado: "+resultado);
		
		model.addAttribute("resultado",resultado);
		return "calculadora";
	}
}
