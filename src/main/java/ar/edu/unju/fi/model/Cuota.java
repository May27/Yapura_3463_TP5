package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa la cuota de un Usuario
 * 
 * @author Marisel Anahi Yapura
 *
 */
@Component
public class Cuota {
	/*
	 * -------------------------------
	 * ----------ATRUBUTOS------------
	 * -------------------------------
	 */
	
	/**
	 * Atributo que representa el id la cuota
	 */
	private long id;
	/**
	 * Atributo que representa la fecha de pago la cuota
	 */
	private LocalDate fechaPago;
	/**
	 * Atributo que representa el periodo en el cual se pago la cuota
	 */
	private String periodo;
	/**
	 * Atributo que representa el monto de la cuota
	 */
	private double monto;
	/**
	 * Atributo que representa el estado de la cuota
	 */
	private String estado;
	/**
	 * Atributo que representa al usuario al cual pertenece la cuota
	 */
	@Autowired
	private Usuario usuario;

	/*
	 * -------------------------------
	 * --------CONSTRUCTORES----------
	 * -------------------------------
	 */
	
	/**
	 * Constructor por defecto
	 */
	public Cuota() {
	}

	/**
	 * Constructor parametrizado
	 * @param id valor del id de la cuota
	 * @param fechaPago valor de la fecha de pago de la cuota 
	 * @param periodo valor del periodo de pago de la cuota
	 * @param monto valor del monto de la cuota
	 * @param estado valor del estado de la cuota
	 * @param usuario valor del usuario a quien corresponde la cuota
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
		this.id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}

	/*
	 * -------------------------------
	 * -------METODOS ACCESORES-------
	 * -------------------------------
	 */	
	
	/**
	 * Devuelve el id de la cuota
	 * @return this.id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Asigna un valor al id de la cuota
	 * @param id valor del id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Devuelve la fecha de pago de la cuota
	 * @return this.fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	/**
	 * Asigna un valor al la fecha de pago de la cuota
	 * @param fechaPago valor de la fecha de pago
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * Devuelve el periodo de pago de la cuota
	 * @return this.periodo
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * Asigna un valor el periodo de pago de la cuota
	 * @param periodo valor del periodo de pago
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * Devuelve el monto de la cuota
	 * @return this.monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * Asigna un valor al monto de la cuota
	 * @param monto valor del monto
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * Devuelve el estado de la cuota
	 * @return this.estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Asigna un valor al estado de la cuota
	 * @param estado valor del estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Devuelve el usuario al cual corresponde la cuota
	 * @return this.usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Asigna un valor al usuario de la cuota
	 * @param usuario valor del usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	//Metodo toString usado para mostrar los valores de cada atributo del objeto Cuota
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}

}
