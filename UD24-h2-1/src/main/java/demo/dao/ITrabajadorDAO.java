package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.dto.Trabajador;

//Al lado del nombre de la tabla, hay que poner el tipo de la pk
public interface ITrabajadorDAO extends JpaRepository<Trabajador, Integer>{
	

}
