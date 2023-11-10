package demo.services;

import java.util.List;

import demo.dto.Trabajador;

public interface ITrabajadorService {
	//Listar todos
	public List<Trabajador> listarTrabajador();
	//Listar por id
	public Trabajador trabajadorXID(Integer id);
	//Guardar
	public Trabajador guardarTrabajador(Trabajador Trabajador);
	//Actualizar
	public Trabajador actualizarTrabajador(Trabajador Trabajador);
	//Eliminar
	public void eliminarTrabajador(Integer id);
}
