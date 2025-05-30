package es.curso.springboot.springbootprofe.formularios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsuarioController {

	@Autowired
	private Usuario usuarioObjeto;
	
    @GetMapping("/usuario")
    public String mostrarUsuario(Model model) {
       
        model.addAttribute("usuario", usuarioObjeto);
        return "usuario";
    }
    
 // Procesar el formulario (POST)
    @PostMapping("/procesar")
    //@RequestMapping(value="/procesar",method=RequestMethod.POST)
    public String procesarFormulario(@ModelAttribute Usuario usuario, Model model) {
        // Aquí ya tienes los datos del formulario en el objeto "usuario"
        model.addAttribute("usuarioProcesado", usuario);
        return "resultado";
    }
}