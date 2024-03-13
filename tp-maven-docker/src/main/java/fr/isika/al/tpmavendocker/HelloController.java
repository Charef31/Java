package fr.isika.al.tpmavendocker;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String getIndex (Model model) {
		model.addAttribute("name", "un nom");
		return "index";
	}
	
	//@postMapping("/send")
//	public ModelAndView sendName(Model model) {
//		String name =(String)model.getAttribute("name");
//		return "/";
//	}

}
