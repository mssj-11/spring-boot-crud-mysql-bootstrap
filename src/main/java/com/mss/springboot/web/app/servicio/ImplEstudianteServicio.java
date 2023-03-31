package com.mss.springboot.web.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mss.springboot.web.app.entidad.Estudiante;
import com.mss.springboot.web.app.repositorio.EstudianteRepositorio;



@Service
public class ImplEstudianteServicio implements EstudianteServicio{
	
	
	@Autowired
	private EstudianteRepositorio estudianteRepositorio;
	
	
	
	@Override
	public List<Estudiante> listarTodosLosEstudiante() {
		// TODO Auto-generated method stub
		return estudianteRepositorio.findAll();	// Buscar todo en la tabla
	}


	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return estudianteRepositorio.save(estudiante);
	}


	@Override
	public Estudiante obtenerEstudiantePorId(Long id) {
		// TODO Auto-generated method stub
		return estudianteRepositorio.findById(id).get();
	}


	@Override
	public Estudiante actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return estudianteRepositorio.save(estudiante);
	}


	@Override
	public void eliminarEstudiante(Long id) {
		// TODO Auto-generated method stub
		estudianteRepositorio.deleteById(id);
	}
	
	
	
	
	
}