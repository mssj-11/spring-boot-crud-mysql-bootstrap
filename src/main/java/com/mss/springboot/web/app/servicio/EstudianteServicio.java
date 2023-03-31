package com.mss.springboot.web.app.servicio;

import java.util.List;

import com.mss.springboot.web.app.entidad.Estudiante;


public interface EstudianteServicio {
	
	
	
	public List<Estudiante> listarTodosLosEstudiante();
	
	
	public Estudiante guardarEstudiante(Estudiante estudiante);
	
	public Estudiante obtenerEstudiantePorId(Long id);
	
	public Estudiante actualizarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante(Long id);
	
	
	
}