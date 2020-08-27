package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author bruno <bruno_alessi@yahoo.com.br>
 * @since 2020-08-27
 */
@Controller
public class VetController {
	
	@SuppressWarnings("static-method")
	@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String listVets() { //Model model) {
		
		//model.addAttribute(attributeName, attributeValue);
		
		return "vets/index";
	}
	
}
