package com.mss.springboot.web.app.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mss.springboot.web.app.servicio.EstudianteServicio;


@Controller
public class EstudianteControlador {
	
	@Autowired
	private EstudianteServicio estudianteServicio;
	
	
	@GetMapping({"/", "/estudiantes"})
	public String listarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes", estudianteServicio.listarEstudiante());
		
		return "estudiantes";
	}
	
	
	
	
}