package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase que representa al estadio de un Equipo
 * 
 * @author Marisel Anahi Yapura
 *
 */
@Component
public class Estadio {
	/*
	 * -------------------------------
	 * ----------ATRUBUTOS------------
	 * -------------------------------
	 */
	
	/**
	 * Atributo que representa al nombre del estadio
	 */
	private String nombre;
	/**
	 * Atributo que representa la fecha de fundación del estadio
	 */	
	private LocalDate fechaFundacion;
	/**
	 * Atributo que representa a la ciudad en la cual esta situado el estadio
	 */	
	private String ciudad;
	/**
	 * Atributo que representa a la capacidad del estadio
	 */	
	private int capacidad;
	/**
	 * Atributo que representa la direccion del estadio
	 */	
	private String direccion;
	
	/*
	 * -------------------------------
	 * --------CONSTRUCTORES----------
	 * -------------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	public Estadio() {
	}

	/**
	 * Constructor parametrizado
	 * @param nombre valor del nombre del estadio
	 * @param fechaFundacion valor de la fecha de fundacion del estadio
	 * @param ciudad valor de la ciudad en la cual se encuentra situado el estadio
	 * @param capacidad valor del la capacidad del estadio
	 * @param direccion valor de la dirección del estadio
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}
	
	/*
	 * -------------------------------
	 * -------METODOS ACCESORES-------
	 * -------------------------------
	 */	

	/**
	 * Devuelve el nombre del estadio
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor al nombre del estadio
	 * @param nombre valor del nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la fecha de fundacion del estadio
	 * @return this.fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * Asigna un valor a la fecha de del estadio
	 * @param fechaFundacion valor de la fecha de fundacion
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * Devuelve la ciudad en la cual se encuentra situado el estadio
	 * @return this.ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Asigna un valor a la ciudad donde se encuentra situado el estadio
	 * @param ciudad valor de la ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Devuelve la capacidad del estadio
	 * @return this.capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Asigna un valor a la capacidad del estadio
	 * @param capacidad valor de la capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Devuelve la dirección del estadio
	 * @return this.direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Asigna un valor a la dirección donde se encuentra situado el estadio
	 * @param direccion valor de la dirección
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	//Metodo toString usado para mostrar los valores de cada atributo del objeto Estadio
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}
	
}
