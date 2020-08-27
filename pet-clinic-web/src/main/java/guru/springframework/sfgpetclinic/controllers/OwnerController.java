package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author bruno <bruno_alessi@yahoo.com.br>
 * @since 2020-08-27
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

	@SuppressWarnings("static-method")
	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners() {
		return "owners/index";
	}
	
}
