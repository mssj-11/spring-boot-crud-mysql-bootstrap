package com.mss.springboot.web.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.springboot.web.app.entidad.Estudiante;


@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long>{
	
	
	
	
}