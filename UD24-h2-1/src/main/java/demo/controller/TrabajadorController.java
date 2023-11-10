package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.dto.Trabajador;
import demo.services.TrabajadorServiceImpl;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {
	@Autowired
	TrabajadorServiceImpl trabajadorServiceImpl;

	@GetMapping("/all")
	public List<Trabajador> listarTrabajador(){
		return trabajadorServiceImpl.listarTrabajador();
	}
	@PostMapping("/add")
	public Trabajador salvarTrabajador(@RequestBody Trabajador trabajador) {
		//if para comprobar que es uno de los trabajos del enum
		if(trabajador.getTrabajo().equals("camarero")){
			trabajador.setSalario(15000);
		}if (trabajador.getTrabajo().equals("chef")|| trabajador.getTrabajo().equals("barman")){
			trabajador.setSalario(17000);
		}else {
			System.out.println("El trabajo asignado no es correcto");
			return null;
		}
		return trabajadorServiceImpl.guardarTrabajador(trabajador);
	}
	@GetMapping("/{id}")
	public Trabajador trabajadorXID(@PathVariable(name="id")Integer id) {
		Trabajador trabajador_xid = new Trabajador();
		trabajador_xid = trabajadorServiceImpl.trabajadorXID(id);
		System.out.println("Trabajador XID: "+trabajador_xid);
		return trabajador_xid;
	}
	@PutMapping("/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name = "id")Integer id, @RequestBody Trabajador trabajador) {
		Trabajador trabajador_seleccionado = new Trabajador();
		Trabajador trabajador_actualizado = new Trabajador();

		trabajador_seleccionado = trabajadorServiceImpl.trabajadorXID(id);

		trabajador_seleccionado.setNombre(trabajador.getNombre());	
												System.out.println(trabajador.getTrabajo());
		//if para comprobar que el trabajo es de la lista del enum
		if(trabajador.getTrabajo().equals("camarero")) {
			trabajador_seleccionado.setTrabajo("camarero");
			trabajador_seleccionado.setSalario(15000);
		}else if(trabajador.getTrabajo().equals("chef")){
			trabajador_seleccionado.setTrabajo("chef");
			trabajador_seleccionado.setSalario(17000);
		}else if(trabajador.getTrabajo().equals("barman")) {
			trabajador_seleccionado.setTrabajo("barman");
			trabajador_seleccionado.setSalario(17000);
		}else {
			System.out.println("El trabajo asignado no es correcto");
			return null;
		}	
		trabajador_actualizado = trabajadorServiceImpl.actualizarTrabajador(trabajador_seleccionado);
		System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);

		return trabajador_actualizado;
	}
	@DeleteMapping("/{id}")
	public void eliminarTrabajador(@PathVariable(name="id")Integer id) {
		trabajadorServiceImpl.eliminarTrabajador(id);
		System.out.println("Trabajador eliminado");
	}
}
