package com.proyecto.cardjitsu.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.cardjitsu.model.Cartas;

@Controller
public class HomeController {
    @GetMapping("/home")
	public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, String last) {
        name = "Vergatario";
        last = "Juego";
		model.addAttribute("name", name);
		model.addAttribute("last", last);
		
		Cartas cartas = new Cartas();
		
		// for(Cartas carta :  cartas.barajarCartas() )	
		// {
			
		// }
		model.addAttribute("cartas", cartas.barajarCartas());
		return "home";
	}
}
