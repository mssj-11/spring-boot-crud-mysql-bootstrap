package com.mss.springboot.web.app.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "estudiantes")
public class Estudiante {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	@Column(name = "apellidos", nullable = false, length = 50)
	private String apellidos;
	@Column(name = "email", nullable = false, length = 30, unique = true)
	private String email;
	
	
	
	//	Constructor
	public Estudiante() {
	}
	public Estudiante(Long id, String nombre, String apellidos, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	public Estudiante(String nombre, String apellidos, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	
	
	//	Getter and Setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	//	toString
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + "]";
	}
	
	
	
}