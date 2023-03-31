package com.mss.springboot.web.app;

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.mss.springboot.web.app.repositorio.EstudianteRepositorio;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringBootCrudMysqlBootstrapApplication{ // implements CommandLineRunner

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudMysqlBootstrapApplication.class, args);
	}


	/*
	@Autowired
	private EstudianteRepositorio estudianteRepositorio;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante estudiante1 = new Estudiante("Miguel", "Perez", "miguelgmail.com");
		estudianteRepositorio.save(estudiante1);
		Estudiante estudiante2 = new Estudiante("Julia", "Ramirez", "juli@gmail.com");
		estudianteRepositorio.save(estudiante2);
		Estudiante estudiante3 = new Estudiante("Eduardo", "Alcantara", "edu@gmail.com");
		estudianteRepositorio.save(estudiante3);
		Estudiante estudiante4 = new Estudiante("Pedro", "Enriquez", "pedro@gmail.com");
		estudianteRepositorio.save(estudiante4);
	}*/
	
	

}