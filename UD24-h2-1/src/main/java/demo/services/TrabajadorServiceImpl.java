package demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.ITrabajadorDAO;
import demo.dto.Trabajador;

@Service
public class TrabajadorServiceImpl implements ITrabajadorService {
	@Autowired
	ITrabajadorDAO iTrabajadorDAO;
	
	//Listar todos
	public List<Trabajador> listarTrabajador(){
		return iTrabajadorDAO.findAll();
		
	};
	//Listar por id
	public Trabajador trabajadorXID(Integer id) {
		return iTrabajadorDAO.findById(id).get();
	};
	//Guardar
	public Trabajador guardarTrabajador(Trabajador Trabajador) {
		return iTrabajadorDAO.save(Trabajador);
	};
	//Actualizar
	public Trabajador actualizarTrabajador(Trabajador Trabajador) {
		return iTrabajadorDAO.save(Trabajador);	
	};
	//Eliminar
	public void eliminarTrabajador(Integer id) {
		iTrabajadorDAO.deleteById(id);
	};
}
