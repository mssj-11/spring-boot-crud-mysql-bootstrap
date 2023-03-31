package com.mss.springboot.web.app.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mss.springboot.web.app.entidad.Estudiante;
import com.mss.springboot.web.app.servicio.EstudianteServicio;


@Controller
public class EstudianteControlador {
	
	@Autowired
	private EstudianteServicio estudianteServicio;
	
	
	@GetMapping({"/estudiantes", "/"})
	public String listarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes", estudianteServicio.listarTodosLosEstudiante());
		
		return "estudiantes";
	}
	
	
	@GetMapping("/estudiantes/nuevo")
	public String formularioCrearEstudiante(Model modelo) {
		Estudiante estudiante = new Estudiante();
		modelo.addAttribute("estudiante", estudiante);
		
		return "crear_estudiante";
	}
	

	//	Guardar Estudiante
	@PostMapping("/estudiantes")
	public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
		estudianteServicio.guardarEstudiante(estudiante);
		
		return "redirect:/estudiantes";
	}
	
	
	//	Obtener Estudiante
	@GetMapping("/estudiantes/editar/{id}")
	public String mostrarFormularioEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("estudiante", estudianteServicio.obtenerEstudiantePorId(id));
		
		return "editar_estudiante";
	}
	
	
	//	Actualizar Estudiante
	@PostMapping("/estudiantes/{id}")
	public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante, Model modelo) {
		Estudiante estudianteExistente = estudianteServicio.obtenerEstudiantePorId(id);
		estudianteExistente.setId(id);
		estudianteExistente.setNombre(estudiante.getNombre());
		estudianteExistente.setApellidos(estudiante.getApellidos());
		estudianteExistente.setEmail(estudiante.getEmail());
		
		estudianteServicio.actualizarEstudiante(estudianteExistente);
		
		return "redirect:/estudiantes";
	}
	
	
	@GetMapping("/estudiantes/eliminar/{id}")
	public String eliminarEstudiante(@PathVariable Long id){
		estudianteServicio.eliminarEstudiante(id);
		
		return "redirect:/estudiantes";
	}
	
	
}