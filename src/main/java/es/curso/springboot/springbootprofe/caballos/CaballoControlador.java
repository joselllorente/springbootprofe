package es.curso.springboot.springbootprofe.caballos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.curso.springboot.springbootprofe.repositories.CaballoRepository;
import jakarta.servlet.http.HttpSession;

@Controller
public class CaballoControlador {

	@Autowired
	private Caballo caballo;
	
	@Autowired
	private CaballoRepository caballoRep;
	
	//@RequestMapping("/caballourl")
	@GetMapping("/caballourl")
	public ModelAndView inicio(Model model, HttpSession session) {
		System.out.println("Entrando en inicio");
		//model.addAttribute("caballoAtributo", caballo);
		System.out.println(session.getAttribute("customer").toString());
		System.out.println("Saliendo de inicio");
		//return "caballoForm";
		//return new ModelAndView("caballoForm");
		return new ModelAndView("caballoForm", "caballoAtributo", caballo);
	}
	
	@PostMapping("/procesarcaballo")
	public String inicio2(Model model, @ModelAttribute Caballo caballo) {
		caballoRep.save(caballo);
		//caballoRep.
		model.addAttribute("caballoResultado",caballo);
		return "caballos/caballoresultado";
	}
	
	
	@GetMapping("/listarcaballos")
	public ModelAndView listar(Model model) {
		return new ModelAndView("caballos/listado_caballos","lista", caballoRep.findAll());
	}
	
	@PostMapping("/filtrar_caballos")
	public ModelAndView filtrar(Model model, @RequestParam ("nombre_caballo") String nombre) {
		
		List<Caballo> caballosFiltrados =  caballoRep.findByNombreStartsWithIgnoreCase(nombre);
				
		return new ModelAndView("caballos/listado_caballos","lista", caballosFiltrados);
	}
	
	
}
