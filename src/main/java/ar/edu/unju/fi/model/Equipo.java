package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa a un Equipo de futbol
 * 
 * @author Marisel Anahi Yapura
 *
 */
@Component
public class Equipo {
	/*
	 * -------------------------------
	 * ----------ATRUBUTOS------------
	 * -------------------------------
	 */
	
	/**
	 * Atributo que representa al npmbre del equipo
	 */
	private String nombre;
	/**
	 * Atributo que representa al estadio de un equipo
	 */
	@Autowired
	private Estadio estadio;

	/*
	 * -------------------------------
	 * --------CONSTRUCTORES----------
	 * -------------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	public Equipo() {
	}

	/**
	 * Constructor parametrizado
	 * @param nombre valor del nombre del equipo
	 * @param estadio valor del estadio del equipo
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}
	
	/*
	 * -------------------------------
	 * -------METODOS ACCESORES-------
	 * -------------------------------
	 */	

	/**
	 * Devuelve el nombre del equipo
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor al id de la cuota
	 * @param nombre valor del nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el estadio del equipo
	 * @return this.estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * Asigna un valor al estadio del equipo
	 * @param estadio valor del estadio
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	//Metodo toString usado para mostrar los valores de cada atributo del objeto Equipo
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}

}
