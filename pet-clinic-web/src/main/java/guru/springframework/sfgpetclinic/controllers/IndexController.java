package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author bruno <bruno_alessi@yahoo.com.br>
 * @since 2020-08-27
 */
@Controller
public class IndexController {

	@SuppressWarnings("static-method")
	@RequestMapping({"", "/", "index", "index.html"})
	public String index() {
		return "index";
	}
}
