package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa al resultado de un partido
 * 
 * @author Marisel Anahi Yapura
 *
 */
@Component
public class Resultado {
	/*
	 * -------------------------------
	 * ----------ATRUBUTOS------------
	 * -------------------------------
	 */
	
	/**
	 * Atributo que representa la fecha del resultado del partido
	 */
	private LocalDate fecha;
	/**
	 * Atributo que representa a uno de los equipos que jugaron el partido
	 */
	@Autowired
	private Equipo equipo1;
	/**
	 * Atributo que representa a uno de los equipos que jugaron el partido
	 */
	@Autowired
	private Equipo equipo2;
	/**
	 * Atributo que representa a los goles que corresponde a uno de los equipos que jugaron el partido
	 */
	private int golesEquipo1;
	/**
	 * Atributo que representa a los goles que corresponde a uno de los equipos que jugaron el partido
	 */
	private int golesEquipo2;
	
	/*
	 * -------------------------------
	 * --------CONSTRUCTORES----------
	 * -------------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	public Resultado() {
	}

	/**
	 * Constructor parametrizado
	 * @param fecha valor de la fecha del resultado del partido
	 * @param equipo1 valor de un equipo que jugo en el partido 
	 * @param equipo2 valor de un equipo que jugo en el partido
	 * @param golesEquipo1 valor de los goles que metio uno de los equipos
	 * @param golesEquipo2 valor de los goles que metio uno de los equipos
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}
	
	/*
	 * -------------------------------
	 * -------METODOS ACCESORES-------
	 * -------------------------------
	 */	

	/**
	 * Devuelve la fecha del resultado del partido
	 * @return this.fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * Asigna un valor a la fecha del resultado de un partido
	 * @param fecha valor de la fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * Devuelve un equipo que jugo en el partido
	 * @return this.equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}

	/**
	 * Asigna un valor a un equipo que jugo en el partido
	 * @param equipo1 valor del equipo1
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	/**
	 * Devuelve un equipo que jugo en el partido
	 * @return this.equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}

	/**
	 * Asigna un valor a un equipo que jugo en el partido
	 * @param equipo2 valor del equipo2
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	/**
	 * Devuelve los goles que que le corresponde a uno de los equipos que jugo en el partido
	 * @return this.golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	/**
	 * Asigna un valor a los goles que metio uno de los equipos
	 * @param golesEquipo1 valor de los goles le corresponden al equipo1
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	/**
	 * Devuelve los goles que le corresponde a uno de los equipos que jugo en el partido
	 * @return this.golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	/**
	 * Asigna un valor a los goles que metio uno de los equipos
	 * @param golesEquipo2 valor de los goles le corresponden al equipo2
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	//Metodo toString usado para mostrar los valores de cada atributo del objeto Resultado
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}

}
