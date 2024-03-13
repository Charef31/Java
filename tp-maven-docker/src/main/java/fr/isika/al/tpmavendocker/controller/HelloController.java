package fr.isika.al.tpmavendocker.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



import org.springframework.http.ResponseEntity;

import org.apache.logging.log4j.message.Message;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {
	
    @GetMapping("/")
    public String getIndex(Model model) {
        // Initialize the model attribute if needed
        model.addAttribute("greeting", "");
        return "index";
    }

    @PostMapping("/sendName")
    public String sendName(@RequestBody String nom, Model model) {
        // Set the received string as the value for "nom" attribute in the model
    	String phrase = "bonjour "+nom+" vous êtes bien matinal";
        model.addAttribute("greeting", phrase);
        
        return "index";
    }
	}

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/")
	public ModelAndView getIndex(ModelMap model) {
		// Initialize the model attribute if needed
		model.addAttribute("greeting", "");
		return new ModelAndView("index", model);
	}

	@PostMapping("/sendName")
	public ModelAndView sendName(@RequestParam(value = "name") String name) {
		System.out.println(name);
		// Set the received string as the value for "nom" attribute in the model
		String phrase = "bonjour " + name + " vous êtes bien matinal";
		

		return new ModelAndView("index", new ModelMap("greeting", phrase));
	}

	
//	@PostMapping("/send")
//	public ModelAndView sendName(Model model) {
//		String name =(String) model.getAttribute("name");
//		return "/";
//	}


}

