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
	public List<Estudiante> listarEstudiante() {
		// TODO Auto-generated method stub
		return estudianteRepositorio.findAll();	// Buscar todo en la tabla
	}
	
	
	
	
	
}