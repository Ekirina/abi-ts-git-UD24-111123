package demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Trabajador")

public class Trabajador {
	//Atributos de la clase

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nombre")//no es del todo necesario
	private String nombre;
	private double salario;
	private String trabajo;
	
	//Constructores de clase
	public Trabajador() {
	}

	public Trabajador(int id, String nombre, double salario, String trabajo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.trabajo = trabajo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", salario=" + salario + ", trabajo=" + trabajo + "]";
	}
	
}
