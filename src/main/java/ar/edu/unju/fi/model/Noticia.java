package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase que representa a una noticia difundida por la liga de futbol
 * 
 * @author Marisel Anahi Yapura
 *
 */
@Component
public class Noticia {
	/*
	 * -------------------------------
	 * ----------ATRUBUTOS------------
	 * -------------------------------
	 */
	
	/**
	 * Atributo que representa a la fecha la noticia
	 */
	private LocalDate fecha;
	/**
	 * Atributo que representa al titulo de la noticia
	 */
	private String titulo;
	/**
	 * Atributo que representa al resumen de la noticia
	 */
	private String resumen;
	
	/*
	 * -------------------------------
	 * --------CONSTRUCTORES----------
	 * -------------------------------
	 */

	/**
	 * Constructor por defecto
	 */
	public Noticia() {
	}

	/**
	 * Constructor parametrizado
	 * @param fecha valor de la fecha de la noticia
	 * @param titulo valor del titulo de la noticia
	 * @param resumen valor del resumen de la noticia
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}
	
	/*
	 * -------------------------------
	 * -------METODOS ACCESORES-------
	 * -------------------------------
	 */	

	/**
	 * Devuelve la fecha de la noticia 
	 * @return this.fecha 
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Asigna un valor a la fecha de la noticia
	 * @param fecha valor de la fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Devuelve el titulo de la noticia
	 * @return this.titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Asigna un valor al titulo de la noticia
	 * @param titulo valor del titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el resumen de la noticia
	 * @return this.resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * Asigna un valor al resumen de la noticia
	 * @param resumen valor del resumen
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	//Metodo toString usado para mostrar los valores de cada atributo del objeto Noticia
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}

}
