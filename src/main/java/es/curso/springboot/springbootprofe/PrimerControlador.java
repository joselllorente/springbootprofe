package es.curso.springboot.springbootprofe;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PrimerControlador {

	@RequestMapping("/inicio")
	public String metodo1 (Model model, HttpServletRequest req, LocalDate date) {
		System.out.println("Mi primer controlador de Spring");
		String valor = req.getParameter("param1");
		model.addAttribute("mensaje", "Jose Luis Llorente ");
		model.addAttribute("param_valor", valor);
		return "hola";
	}
}
