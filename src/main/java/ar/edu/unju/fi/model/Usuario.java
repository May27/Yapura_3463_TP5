package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase que representa a un Usuario
 * @author Marisel Anahi Yapura
 *
 */
@Component
public class Usuario {
	/*
	 * -------------------------------
	 * ----------ATRUBUTOS------------
	 * -------------------------------
	 */	

	/**
	 * Atributo que representa el id del usuario
	 */
	private long id;
	/**
	 * Atributo que representa el nombre del usuario
	 */
	private String nombre;
	/**
	 * Atributo que representa el apellido del usuario
	 */
	private String apellido;
	/**
	 * Atributo que representa la fecha de nacimiento del usuario
	 */
	private LocalDate fechaNacimiento;
	/**
	 * Atributo que representa la direccion del usuario
	 */
	private String direccion;
	/**
	 * Atributo que representa el dni del usuario
	 */
	private long dni;
	/**
	 * Atributo que representa la fecha de alta del usuario
	 */
	private LocalDate fechaAlta;
	/**
	 * Atributo que representa el tipo de usuario
	 */
	private String tipo; // SOCIO, ADMIN, CONSULTOR
	/**
	 * Atributo que representa la contraseña del usuario
	 */
	private String password;

	/*
	 * -------------------------------
	 * --------CONSTRUCTORES----------
	 * -------------------------------
	 */

	/**
	 * Constructor por defecto
	 */
	public Usuario() {
	}

	/**
	 * Constructor parametrizado
	 * @param id valor del id del usuario
	 * @param nombre valor del nombre del usuario
	 * @param apellido valor del apellido del usuario
	 * @param fechaNacimiento valor de la fecha de nacimieto del usuario
	 * @param direccion valor de la direccion del usuario
	 * @param dni valor del dni del usuario
	 * @param fechaAlta valor de la fecha de alta del usuario
	 * @param tipo valor del tipo de usuario
	 * @param password valor de la contraseña del usuario
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.password = password;
	}
	
	/*
	 * -------------------------------
	 * -------METODOS ACCESORES-------
	 * -------------------------------
	 */	

	/**
	 * Devuelve el id del Usuario
	 * @return this.id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Asigna un valor al id del Usuario
	 * @param id valor del id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Devuelve el nombre del Usuario
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor al nombre del Usuario
	 * @param nombre valor del nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el apellido del Usuario
	 * @return this.apellido
	 */
	public String getApellido() {
		return apellido;
	}

	
	/**
	 * Asigna un valor al apellido del Usuario
	 * @param apellido valor del apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Devuelve el apellido del Autor
	 * @return this.fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Asigna un valor a la fecha de nacimiento del Usuario
	 * @param fechaNacimiento valor de la fecha de nacimiento
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Devuelve la direccion del Usuario
	 * @return this.direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Asigna un valor a la direccion del Usuario
	 * @param direccion valor del la direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Devuelve el dni del Usuario
	 * @return this.dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * Asigna un valor al dni del Usuario
	 * @param dni valor del dni del Usuario
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve la fecha del alta del Usuario
	 * @return this.fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * Asigna un valor a la fecha de alta del Usuario
	 * @param fechaAlta valor de la fecha de alta
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * Devuelve el tipo de Usuario
	 * @return this.tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Asigna un valor al tipo de Usuario
	 * @param tipo valor del tipo de usuario
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Devuelve la contraseña del Usuario
	 * @return this.password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Asigna un valor a la contraseña del Usuario
	 * @param password valor de la contraseña
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	//Metodo toString usado para mostrar los valores de cada atributo del objeto Usuario
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", tipo="
				+ tipo + ", password=" + password + "]";
	}

}
